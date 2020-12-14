<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>admin Page</title>

    <link rel="stylesheet" href="../../CSS/reset.css">
    <link rel="stylesheet" href="../../CSS/style.css">
    <link rel="stylesheet" href="../../CSS/admin/admin.css">
    <link rel="stylesheet" href="../../CSS/admin/user/user.css">
</head>
<body>
<header id="header" class="header">
   
    <div class="logo-bar">
        <h1 class="no-display">��ó</h1>
        <a href="../index.html"><div class="logo"></div></a>
        <ul>
          <li><button class="logout">�α׾ƿ�</button></li>
        </ul>
    </div>

    <nav id="nav" class="nav">
        <h1 class="no-display">�޴�</h1>
        <ul>
            <li><a href="#">�⺻����</a></li>
            <li><a href="#">��ǰ����</a></li>
            <li><a href="#">�ֹ�����</a></li>
            <li><a href="index">ȸ������</a></li>
            <li><a href="#">�Խ��ǰ���</a></li>
            <li><a href="#">������</a></li>
        </ul>
    </nav>

</header>

<div id="body" class="body">
    <aside class="aside">
        <a href="index"><h1 class="img-button user-button">ȸ������</h1></a>
        <ul class="aside-menu">
            <li> ȸ�� ����</li>
            <ul>
                <li><a href="list.html">ȸ�� ����Ʈ</a></li>
                <li><a href="mana.html">ȸ����� ����</a></li>
                <li><a href="leave">Ż��ȸ�� ����Ʈ</a></li>
                <li><a href="point">������ ����</a></li>
            </ul>
            <li>2</li>
            <li>3</li>
        </ul>
    </aside>
    
    <section class="main-section"">
        <main class="main">
            <div class="main-head">
                <h1>Ż��ȸ�� ����Ʈ</h1>
                <span>home > ȸ������ > Ż��ȸ�� ����Ʈ</span>
            </div>
            <div class="main-body">
                <section>
                    <h1>Ż��ȸ�� �˻�</h1>
                    <form method="post" action="leave">
                        <table >
                            <tr>
                                <th>����</th>
                                <td>
                                    <select>
                                        <option>��ü</option>
                                        <option>Ż�� ��û</option>
                                        <option>Ż�� ����</option>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <th>���̵�</th>
                                <td><input type="text" name="nicname"></td>
                            </tr>
                            <tr>
                                <th>��û��</th>
                                <td>
                                    <input type="radio" name="signintype" value="all">
                                    <label for="all">��ü</label>
                                    <input type="radio" name="signintype" value="user">
                                    <label for="user">�Ϲ� ȸ��</label>
                                    <input type="radio" name="signintype" value="gym">
                                    <label for="gym">���� �ü�</label>
                                </td>
                            </tr>
                            <tr>
                                <th>Ż���û�Ⱓ</th>
                                <td>
                                    <input type="number" min="2019" max="2020" > ��
                                    <input type="number" min="1" max="12" > ��
                                    <input type="number" min="1" max="31" > ��
                                </td>
                            </tr>
                        </table>

                        <input class="form-button" type="submit" value="�˻�">
                    </form>
                </section>
                <section class="table">
                    <h1>�˻����</h1>
                    <table border="1">
                        <tr>
                            <th>��ȣ</th>
                            <th>���̵�</th>
                            <th>�̸�</th>
                            <th>���</th>
                            <th>ó��</th>
                        </tr>
                        <c:forEach var="m" items="${list}">
	                        <tr>
	                            <td>${m.id }</td>
	                            <td>${m.nicname }</td>
	                            <td>${m.name }</td>
	                            <td></td>
	                            <td>
	                            	<a href="del?id=${m.id }">����</a>
	                            </td>
	                        </tr>
                        </c:forEach>
                    </table>				
                </section>  
            </div>
        </main>
    </section>
</div>

</body>
</html>

