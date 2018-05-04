/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AWT;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JPasswordField;

public class LoginFrame {

    private Label UserName_lebel, Password_lebel, errorlabel;
    private JPasswordField PasswordText;
    private TextField UserText;
    private Button login, cancel;
    private Frame fm;
    private MenuBar mymenubar;

    public LoginFrame() {
        fm = new Frame();
        fm.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        fm.setSize(600, 600);
        fm.setTitle("Login Frame");
        fm.setLayout(null);
        fm.setVisible(true);
        MenuBar();
        creatUI();
    }

    private void MenuBar() {
        mymenubar = new MenuBar();
        Menu menu1 = new Menu("College");
        Menu submenu = new Menu("Kist");
        MenuItem i1 = new MenuItem("Shanker Dev");
        MenuItem i2 = new MenuItem("Asian");
        MenuItem i3 = new MenuItem("Apex");
        MenuItem i4 = new MenuItem("Kastamandap");
        MenuItem i5 = new MenuItem("BBA");
        MenuItem i6 = new MenuItem("BIM");
        MenuItem i7 = new MenuItem("BBS");
        submenu.add(i5);
        submenu.add(i6);
        submenu.add(i7);
        menu1.add(i1);
        menu1.add(i2);
        menu1.add(i3);
        menu1.add(i4);
        menu1.add(submenu);
        Menu menu2 = new Menu("Teachers");
        Menu menu3 = new Menu("Students");
        mymenubar.add(menu1);
        mymenubar.add(menu2);
        mymenubar.add(menu3);
        fm.setMenuBar(mymenubar);

    }

    private void creatUI() {
        errorlabel = new Label();

        UserName_lebel = new Label("Username");
        UserName_lebel.setBounds(100, 200, 80, 30);
        UserName_lebel.setBackground(Color.gray);
        fm.add(UserName_lebel);

        UserText = new TextField();
        UserText.setBounds(190, 200, 160, 30);
        fm.add(UserText);

        Password_lebel = new Label("Password");
        Password_lebel.setBounds(100, 240, 80, 30);
        Password_lebel.setBackground(Color.gray);
        fm.add(Password_lebel);

        PasswordText = new JPasswordField();
        PasswordText.setBounds(190, 240, 160, 30);
        fm.add(PasswordText);

        login = new Button("Login");
        login.setBounds(140, 300, 80, 30);
        login.setBackground(Color.white);
        fm.add(login);
        login.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                login.setBackground(Color.green);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                login.setBackground(Color.white);
            }

            @Override
            public void mouseClicked(MouseEvent me) {
                authenticate();
            }
        });

        cancel = new Button("Cancel");
        cancel.setBounds(225, 300, 80, 30);
        cancel.setBackground(Color.white);
        fm.add(cancel);
        cancel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                cancel.setBackground(Color.red);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                cancel.setBackground(Color.white);
            }
        });
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        fm.setVisible(true);
    }

    public void authenticate() {
        String userName = UserText.getText();
        String password = String.valueOf(PasswordText.getPassword());

        //Checking if username is empty
        if (userName.isEmpty()) {
            errorlabel.setText("Username can not be empty!");
            errorlabel.setBounds(360, 200, 300, 30);
            errorlabel.setForeground(Color.red);
            fm.add(errorlabel);

            //Removing errorLabel when field is not empty      
            UserText.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent ke) {
                    fm.remove(errorlabel);
                }

            });
            return;
        }

        //Checking if password is empty 
        if (password.isEmpty()) {
            errorlabel.setText("Password can not be empty!");
            errorlabel.setBounds(360, 240, 300, 30);
            errorlabel.setForeground(Color.red);
            fm.add(errorlabel);

            //Removing errorLabel when field is not empty  
            PasswordText.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent ke) {
                    fm.remove(errorlabel);
                }

            });
            return;
        }

        //checking password and username
        doLogin(userName, password);

    }

    public static void main(String[] args) {
        LoginFrame lf = new LoginFrame();

    }

    private void doLogin(String userName, String password) {
        String dbmsurl = "jdbc:mysql://localhost:3306/college";
        String dbmsUsernamename = "root";
        String dbmspassword = "";
        String query = "SELECT * FROM admin WHERE aUserName = '" + userName + "' and aPassword = '" + password + "'";
        String adminName = "";
        String adminPassword = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(dbmsurl, dbmsUsernamename, dbmspassword);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                openNewFrame();
            } else {
                errorlabel.setText("Invalid Username or Password!");
                errorlabel.setBounds(360, 240, 300, 30);
                errorlabel.setForeground(Color.red);
                fm.add(errorlabel);
            }
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void openNewFrame() {
        NewFrame nf = new NewFrame(UserText.getText());
        nf.setVisible(true);
        fm.dispose();
    }

}
