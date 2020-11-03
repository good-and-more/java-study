package com.itheima.demo03.Filter;

import java.io.File;
import java.io.FileFilter;

public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        /*
        * 如果pathname是一个文件夹，返回true，继续遍历这个文件夹
        * */
        if(pathname.isDirectory()) {
            return true;
        }
        return pathname.getName().toLowerCase().endsWith(".java");
    }
}
