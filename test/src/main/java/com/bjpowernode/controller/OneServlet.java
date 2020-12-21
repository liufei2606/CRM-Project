package com.bjpowernode.controller;

import com.bjpowernode.domian.Student;

import java.io.IOException;

public class OneServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        // {"name":"张三","age":"18"}
        Student s1 = new Student(1, "zs", "123");
        Student s2 = new Student(2, "ls", "1233");
        response.setContentType("text/html;charset=utf-8");
        //{"st1":"{"id":"?","name":"?","pwd":"?"}","st2":"{"id":"?","name":"?","pwd":"?"}"}
        String json = "{\"st1\":\"{\"id\":\"" + s1.getId()
                + "\",\"name\":\"" + s1.getName()
                + "\",\"pwd\":\"" + s1.getPwd()
                + "\"}\",\"st2\":\"{\"id\":\"" + s2.getId()
                + "\",\"name\":\"" + s2.getName()
                + "\",\"pwd\":\"" + s2.getPwd() + "\"}\"}";
        System.out.println(json);
        response.getWriter().print(json);
    }
}
