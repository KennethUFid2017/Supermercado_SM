# JSF JPA CRUD Primefaces with MySQL


Simple CRUD ,MySQL , JPA ,Primefaces for Glasfish in Netbeans.

1.Import this Database: https://github.com/LeoCR/Supermercado_SM/blob/master/supermarket_sm_sql/jpa_ddl/final_ddl.sql in your favorite MySQL DBAs ,such as MySQL Workbench or in your phpAdmin(XAMPP,MAMPP,WAMPP).

2.Make sure that you have the MySQL driver in your Glasfish Library Folder ( For example : C:\Program Files\glassfish4\glassfish\lib ) ,so if you havent copy and paste this file.jar:
http://www.java2s.com/Code/JarDownload/com.mysql/com.mysql.jdbc_5.1.5.jar.zip

3.Edit the glassfish-resources.xml for set your MySQL Credentials such as : Password , Username ,ServerName,Port ,URL  (https://github.com/LeoCR/Supermercado_SM/blob/master/supermarket_sm/supermercado-sm/src/main/webapp/WEB-INF/glassfish-resources.xml ) ,and make sure that all the credentials works.

4.Then Open your Netbeans and Open this Maven Project: https://github.com/LeoCR/Supermercado_SM/tree/master/supermarket_sm/supermercado-sm
and Right Click on the project ,then select Clean and Build.

5.Make the deployment manually open your Glasfish Admin Console,going to Applications and Add New ,then upload your supermarket_sm.war ,if you having errors review your database connections or glassfish-resources.xml .

6.The visit http://localhost:8080/supermercado-sm/admin/panel/administracion.xhtml or 
 http://localhost:8080/supermercado-sm/index.xhtml
 
 7.Review your console in your browser ,that should not be mistaken console errors.
 
 


