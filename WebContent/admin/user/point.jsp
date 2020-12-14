<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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

    <section class="main-section">
        <main id="main" class="main">
            <div class="main-head">
                <h1>������ ����</h1>
                <span>home > ȸ������ > ������ ����</span>
            </div>
            <div class="main-body">
                <form>
                    <section>
                        <h1>������ �⺻����</h1>
                        <table>
                            <tr>
                                <th>��뿩��</th>
                                <td>
                                    <input type="radio" name="pointusetype" value="use">
                                    <label for="use">�����</label>
                                    <input type="radio" name="pointusetype" value="unuse">
                                    <label for="unuse">��� ����</label>
                                </td>
                            </tr>
                            <tr>
                                <th>������ ǥ�� ����</th>
                                <td><input type="text" ></td>
                            </tr>
                        </table>
                    </section>
                    <section class="table-section">
                        <h1>������ ���� ����</h1>
                        <table>
                            <tr>
                                <th>�������� ������</th>
                                <td>�ű԰��Խ� ������<input type="text">�� �߰��� �����մϴ�.</td>
                            </tr>
                            <tr>
                                <th>��õ�� ������</th>
                                <td>
                                    ���Խ� ��õ�� �Է��ϸ� ������<input type="text">����<br>
                                    ��õ ���� ȸ�����Դ� ������<input type="text">����
                                </td>
                            </tr>
                            <tr>
                                <th>��ǰ���Ž� ������</th>
                                <td>��ǰ���� �ݾ���<input type="text">% �� ���������� ����</td>
                            </tr>
                            <tr>
                                <th>���� ������</th>
                                <td>���� �ݾ���<input type="text">% �� ���������� ����</td>
                            </tr>                     
                        </table>
                    </section>
                    
                    <input class="form-button" type="submit" value="����">
                </form>
            </div>
        </main>
    </section>
</div>
</body>
</html>