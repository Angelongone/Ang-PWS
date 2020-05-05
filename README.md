# 个人网页简易开发系统

## 一、前言

### 1.1 项目背景

近年来随着互联网的兴起以及5G时代的到来，个人网站也在不断的发展。虽然目前有许多人已经拥有自己的个人网站。这大部分都是计算机工作者或者是由一定的计算机相关知识的人。但是还有很多对计算机不是很了解的人也想拥有自己的个人网站。所以一个简易的个人网站搭建便成了他们的不二之选。

## 二、可行性分析

### 2.1 系统基本要求

#### 2.1.1 系统采用架构

本项目采用浏览器/服务器(B/S)架构：浏览器可用google，Firefox，ie以及其它浏览器，服务器端使用Tomcat8.5,数据库采用MySQL6.1.

#### 2.1.2 主要功能要求

主要分为：网页搭建(提供模板)、个人博客(可选)、网页收藏(可选)、人生坐标(可选)、个人网页管理、系统管理等

1. 网页搭建主要的功能：本项目提供网页模板，用户可通过模板搭建个人网页。(可选择背景图片，显示信息的选择等自定义选项)
2. 个人博客主要功能：个人博客是网页中可选显示，其完成个人博客(浏览、撰写、发表文章)等功能
3. 网页收藏主要功能：浏览网页的收藏、快速访问等 还可将其设置成浏览器的默认主页面。
4. 人生坐标主要功能：以年龄为坐标，用户可将人生中重要的经历，在每一个节点进行记录。
5. 个人网页管理功能：登录、更改个人网页、退出、消息管理等
6. 系统管理：用户管理、博客分类与归类、公告管理、评论管理、系统维护等。

#### 2.1.3 系统运行环境

服务器运行采用Linux Centos 7 系统，浏览器端使用装有基本浏览器的操作系统即可，一般是主流的操作系统。

### 2.2系统开发要求

#### 2.2.1 网站实现

开发周期：文档编写3周，代码编写3周，软件测试1周。

#### 2.2.2环境搭建

服务器端采用云服务提供商的云主机，安装Linux Centos、Tomcat、MySql、java环境等搭建网站系统环境。

#### 2.2.3 费用开支与效益分析

1. 租用阿里云的学生云主机9.9元/月，环境搭建采用开源免费软件。
2. 代码开发，因项目是小型系统，开发与维护为1人。

* 总结：各项开支预算为9.9元/月，因本系统为开源免费并非以营利为主，所以经济效益暂定为0.

### 2.3 其他各因素的可行性分析

#### 2.3.1侵权分析

法律方面问题较少，因是个人网站提供商，所以将严格将个网站信息进行过滤。因本项目属于及小众项目，所以一般并未商用，侵权的可能性小。

### 3可行性分析总结

上述可行性分析，再参考现有开发资料、文档等资源，本项目的体系结构比较完善，简单，开发成本低，具备进一步需求分析与开发的条件。

## 三、项目功能需求

### 3.1 基本需求分析
