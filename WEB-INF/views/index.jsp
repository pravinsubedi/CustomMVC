<%-- 
    Document   : index
    Created on : Feb 23, 2016, 7:39:42 AM
    Author     : pravin
--%>
<%@include file="header.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
${requestScope.projects}
 <h1>Projects</h1>
 <div class="pull-right">
    <a href="${project.id}" class="btn btn-primary btn-sm"><span class="glyphicon glyphicon-plus"></span></a>
</div>
<table class="table table-bordered table-striped table-hover">
    <tr>
        <th>Id</th>
        <th>Title</th>
        <th>Start Date</th>
        <th>End Date</th>
        <th>Status</th>
        <th>Action</th>
    </tr>
    
 
<%@include file="footer.jsp" %> 