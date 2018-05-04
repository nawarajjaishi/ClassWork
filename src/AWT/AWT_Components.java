/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AWT;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Jaction76
 */
public class AWT_Components {

    Frame fm;
    private Label fnamelb, lnamelb, addresslb, contactlb, usernamelb, passwordlb, emaillb, genderlb, clzlb, programlb, seclb, deslb;
    private TextField fnametxt, lnametxt, addresstxt, contacttxt, usernametxt, passwordtxt, emailtxt;
    private MenuBar mb;
    private TextArea area;
    private Choice ch;
    private List li;
    private Checkbox m, f, a, b;
    private CheckboxGroup cbg;
    private Button login, cancle;

    public AWT_Components() {
        fm = new Frame("Complete AWT Components Uses");
        gui();
        menu();

        fm.setSize(800, 600);
        fm.setLayout(null);
        fm.setVisible(true);
        fm.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                fm.dispose();
            }
        });
    }

    private void menu() {
        mb = new MenuBar();
        Menu menu1 = new Menu("Colleges");
        Menu submenu = new Menu("KIST");
        MenuItem i1 = new MenuItem("ShankerDev");
        MenuItem i2 = new MenuItem("Apex");
        MenuItem i3 = new MenuItem("NCCS");
        MenuItem i4 = new MenuItem("Peoples");
        MenuItem i5 = new MenuItem("BBA");
        MenuItem i6 = new MenuItem("BIM");
        MenuItem i7 = new MenuItem("BBS");
        MenuItem i8 = new MenuItem("BIT");

        submenu.add(i5);
        submenu.add(i6);
        submenu.add(i7);
        submenu.add(i8);

        menu1.add(i1);
        menu1.add(i2);
        menu1.add(i3);
        menu1.add(i4);
        menu1.add(submenu);

        mb.add(menu1);

        fm.setMenuBar(mb);
    }

    public static void main(String args[]) {
        AWT_Components awtcom = new AWT_Components();
    }

    private void gui() {
        fnamelb = new Label("First Name : ");
        fnamelb.setBounds(50, 50, 100, 30);
        fnametxt = new TextField();
        fnametxt.setBounds(170, 50, 150, 30);

        lnamelb = new Label("last Name : ");
        lnamelb.setBounds(50, 100, 100, 30);
        lnametxt = new TextField();
        lnametxt.setBounds(170, 100, 150, 30);

        addresslb = new Label("Address : ");
        addresslb.setBounds(50, 150, 100, 30);
        addresstxt = new TextField();
        addresstxt.setBounds(170, 150, 150, 30);

        contactlb = new Label("Contact No. : ");
        contactlb.setBounds(50, 200, 100, 30);
        contacttxt = new TextField();
        contacttxt.setBounds(170, 200, 150, 30);

        emaillb = new Label("Email : ");
        emaillb.setBounds(50, 250, 100, 30);
        emailtxt = new TextField();
        emailtxt.setBounds(170, 250, 150, 30);

        genderlb = new Label("Gender : ");
        genderlb.setBounds(50, 300, 100, 30);
        m = new Checkbox("Male", cbg, true);
        m.setBounds(170, 300, 50, 30);
        f = new Checkbox("Femal", cbg, false);
        f.setBounds(240, 300, 50, 30);

        clzlb = new Label("College : ");
        clzlb.setBounds(50, 350, 100, 30);
        ch = new Choice();
        ch.setBounds(170, 350, 100, 30);
        ch.add("Kist");
        ch.add("NCCS");
        ch.add("Cap");
        ch.add("Peoples");

        programlb = new Label("Program : ");
        programlb.setBounds(50, 400, 100, 30);
        li = new List();
        li.add("BBA");
        li.add("BIM");
        li.add("BBS");
        li.add("BIT");
        li.setBounds(170, 400, 100, 30);

        seclb = new Label("Section : ");
        seclb.setBounds(50, 450, 100, 30);
        a = new Checkbox("SEC.'A'", true);
        a.setBounds(170, 450, 100, 30);
        b = new Checkbox("SEC.'B'", false);
        b.setBounds(280, 450, 100, 30);

        deslb = new Label("Description : ");
        deslb.setBounds(50, 500, 100, 30);
        area = new TextArea();
        area.setBounds(170, 500, 400, 100);

        fm.add(fnamelb);
        fm.add(fnametxt);

        fm.add(lnamelb);
        fm.add(lnametxt);

        fm.add(addresslb);
        fm.add(addresstxt);

        fm.add(contactlb);
        fm.add(contacttxt);

        fm.add(emaillb);
        fm.add(emailtxt);

        fm.add(genderlb);
        fm.add(m);
        fm.add(f);

        fm.add(clzlb);
        fm.add(ch);

        fm.add(programlb);
        fm.add(li);

        fm.add(seclb);
        fm.add(a);
        fm.add(b);

        fm.add(deslb);
        fm.add(area);

    }

}
