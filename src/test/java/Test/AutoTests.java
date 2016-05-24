package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Steps.Steps;

public class AutoTests {
    private Steps steps;
    private final String USERNAME = "1941936";
    private final String PASSWORD = "12345678";
    private final String name = "automation_test";
    private final String searchworld = "�����������";
    private final String TEXT = "TEST NG";
    @BeforeMethod(description = "Init Browser")
    public void setUp(){
        steps=new Steps();
        steps.initBrowser();
    }
//����
    @Test(description = "Login to onliner.by")
    public void loginonliner() {
        steps.loginonliner(USERNAME, PASSWORD);
        Assert.assertTrue(steps.isloggedin());
    }
//�����
    @Test(description = "LogOut to onliner.by")
    public void logoutonliner(){
        steps.logoutonliner(USERNAME, PASSWORD);
        Assert.assertTrue(steps.isloggedout());
    }
//�����
    @Test(description = "Search onliner.by")
    public void search(){
        steps.search(searchworld);
        Assert.assertTrue(steps.issearched());
    }
  //�����
    @Test(description = "Recall onliner.by")
    public void recall(){
        steps.recall(USERNAME,PASSWORD,TEXT);
        Assert.assertTrue(steps.isrecall());
    }
   //�������� ���������
    @Test(description = "SendMessage onliner.by")
    public void sendmessage(){
        steps.sendMessage(name,USERNAME,PASSWORD,TEXT);
        Assert.assertTrue(steps.issendMessage());
    }
 //�������� � �������
    @Test(description = "EnterBasket onliner.by")
    public void enterbasket() throws InterruptedException {
        steps.enterbasket(USERNAME,PASSWORD);
        Assert.assertTrue(steps.isenterbasket());
    }
//�������� ����
    @Test(description = "CreateTheme onliner.by")
    public void createtheme(){
        steps.createtheme(USERNAME,PASSWORD,TEXT,TEXT);
        Assert.assertTrue(steps.iscreatetheme());
    }
 //������� �� �������
    @Test(description = "DeleteBasket onliner.by")
    public void deletebasket() throws InterruptedException {
        steps.deletebasket(USERNAME,PASSWORD);
        Assert.assertTrue(steps.isdeletebasket());
    }
  //�������� ����������
    @Test(description = "Comment onliner.by")
    public void comment() throws InterruptedException {
        steps.comment(USERNAME,PASSWORD,TEXT);
        Assert.assertTrue(steps.iscomment());
    }
    //��������� �������
    @Test(description = "Compare onliner.by")
    public void compare() throws InterruptedException {
        steps.compare(USERNAME,PASSWORD,TEXT);
        Assert.assertTrue(steps.iscompare());
    }
}

