package com.springboot.vue.controller.data;

import com.springboot.vue.common.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RequestMapping("/file")
@RestController
public class FileController {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    @Value("${filePath}")
    private String filePath;

    @PostMapping("/upload")
    public Result uploadFile(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        String curDate = sdf.format(new Date()) + "/";
        File folder = new File(filePath + curDate);
        if (!folder.isDirectory()) {
            folder.mkdirs();
        }
        String originalName = file.getOriginalFilename();
        String newName = UUID.randomUUID().toString() + originalName.substring(originalName.lastIndexOf("."), originalName.length());
        try {
            File newFile = new File(folder, newName);
            byte [] bytes = file.getBytes();
            OutputStream out = new FileOutputStream(newFile);
            out.write(bytes);
            String filePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/file/" + curDate + newName;
            return Result.success(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Result.error("上传失败");
    }

    @PostMapping("/uploads")
    public Result uploadFiles(@RequestParam("files") MultipartFile[] files, HttpServletRequest request) {
        List<String> filePathList = new ArrayList<>();
        for (MultipartFile file : files) {
            Result result = uploadFile(file, request);
            if (result.isSuccess()) {
                filePathList.add(String.valueOf(result.data));
            }
        }
        return Result.success(filePathList);
    }
}
