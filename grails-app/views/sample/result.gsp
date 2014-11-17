<%--
  Created by IntelliJ IDEA.
  User: naresha
  Date: 15/11/14
  Time: 12:11 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
       <table>
           <thead>
           <tr>
               <th>First Name</th>
               <th>Last Name</th>
           </tr>
           </thead>
           <tbody>
                <g:each in="${people}" var="person">
                    <tr>
                        <td>${person.firstName}</td>
                        <td>${person.lastName}</td>
                    </tr>
                </g:each>
           </tbody>
       </table>
</body>
</html>