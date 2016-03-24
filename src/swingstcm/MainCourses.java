package swingstcm;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;


public class MainCourses extends javax.swing.JFrame {
    
    private Course newcourse = new Course();
    private int whichone=0;
    ImageIcon newourse = new ImageIcon(this.getClass().getResource("Images/newcourse.png"));
    ImageIcon read = new ImageIcon(this.getClass().getResource("Images/read.png"));
    ImageIcon newparticipant = new ImageIcon(this.getClass().getResource("Images/parti.png"));
    ImageIcon newinstructor = new ImageIcon(this.getClass().getResource("Images/ins.png"));
    
    public MainCourses() {
        
        initComponents();
        newfileTool.setIcon(newourse);
        readTool.setIcon(read);
        partiTool.setIcon(newparticipant);
        insTool.setIcon(newinstructor);
        newfileTool.setToolTipText("New Course");
        readTool.setToolTipText("Read From File");
        partiTool.setToolTipText("New Participant");
        insTool.setToolTipText("New Instructor");
        emptyPanel.setVisible(true);
        EnterFacultyinternal.setVisible(false);
        EnterCourseinternal.setVisible(false);
       
        
        DefaultTreeModel model = (DefaultTreeModel) courseTree.getModel();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        
        model.reload();
        
        validate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ToolBar = new javax.swing.JToolBar();
        newfileTool = new javax.swing.JButton();
        readTool = new javax.swing.JButton();
        partiTool = new javax.swing.JButton();
        insTool = new javax.swing.JButton();
        jSplitPane2 = new javax.swing.JSplitPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        courseTree = new javax.swing.JTree();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        EnterFacultyinternal = new javax.swing.JScrollPane();
        jPanel22 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        Name7 = new javax.swing.JTextField();
        Department6 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        Address6 = new javax.swing.JTextArea();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        MobileNo7 = new javax.swing.JTextField();
        Email7 = new javax.swing.JTextField();
        mobilealert7 = new javax.swing.JLabel();
        emailalert7 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        Submit7 = new javax.swing.JButton();
        Cancel8 = new javax.swing.JButton();
        EnterCourseinternal = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Fee1 = new javax.swing.JTextField();
        Duration1 = new javax.swing.JSpinner();
        yearD1 = new javax.swing.JComboBox<>();
        monthD1 = new javax.swing.JComboBox<>();
        dateD1 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        integeralert1 = new javax.swing.JLabel();
        Dalert1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        CheckBox = new javax.swing.JCheckBox();
        coordalert = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Ins = new javax.swing.JButton();
        Partis = new javax.swing.JButton();
        partiCount = new javax.swing.JLabel();
        insCount = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        Create = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        emptyPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        readfromfile = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        readFile = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(58, 58, 58));
        setResizable(false);

        ToolBar.setRollover(true);

        newfileTool.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        newfileTool.setFocusable(false);
        newfileTool.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newfileTool.setMaximumSize(new java.awt.Dimension(32, 32));
        newfileTool.setMinimumSize(new java.awt.Dimension(32, 32));
        newfileTool.setPreferredSize(new java.awt.Dimension(32, 32));
        newfileTool.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        newfileTool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newfileToolActionPerformed(evt);
            }
        });
        ToolBar.add(newfileTool);

        readTool.setFocusable(false);
        readTool.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        readTool.setMaximumSize(new java.awt.Dimension(32, 32));
        readTool.setMinimumSize(new java.awt.Dimension(32, 32));
        readTool.setPreferredSize(new java.awt.Dimension(32, 32));
        readTool.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        readTool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readToolActionPerformed(evt);
            }
        });
        ToolBar.add(readTool);

        partiTool.setFocusable(false);
        partiTool.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        partiTool.setMaximumSize(new java.awt.Dimension(32, 32));
        partiTool.setMinimumSize(new java.awt.Dimension(32, 32));
        partiTool.setPreferredSize(new java.awt.Dimension(32, 32));
        partiTool.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        partiTool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partiToolActionPerformed(evt);
            }
        });
        ToolBar.add(partiTool);

        insTool.setFocusable(false);
        insTool.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        insTool.setPreferredSize(new java.awt.Dimension(32, 32));
        insTool.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        insTool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insToolActionPerformed(evt);
            }
        });
        ToolBar.add(insTool);

        jSplitPane2.setDividerLocation(185);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Courses");
        courseTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(courseTree);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Course Tree", jPanel1);

        jSplitPane2.setLeftComponent(jTabbedPane1);

        EnterFacultyinternal.setPreferredSize(new java.awt.Dimension(769, 605));

        jPanel22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, null, null));

        jLabel45.setText("Address :");

        Name7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name7NameActionPerformed(evt);
            }
        });

        Department6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Department6DepartmentActionPerformed(evt);
            }
        });

        jLabel46.setText("Department :");

        jLabel47.setText("Name :");

        Address6.setColumns(20);
        Address6.setRows(5);
        jScrollPane13.setViewportView(Address6);

        jLabel48.setText("Mobile No :");

        jLabel49.setText("Email :");

        MobileNo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MobileNo7MobileNoActionPerformed(evt);
            }
        });

        Email7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Email7EmailActionPerformed(evt);
            }
        });

        mobilealert7.setText("Enter a valid mobile number !");

        emailalert7.setText("Enter a valid email ID !");

        jPanel21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, null, null));

        Submit7.setText("Submit");
        Submit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit7Submit1ActionPerformed(evt);
            }
        });

        Cancel8.setText("Cancel");
        Cancel8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel8Cancel1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Submit7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Cancel8, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancel8)
                    .addComponent(Submit7))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45)
                            .addComponent(jLabel48)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(MobileNo7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(mobilealert7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Name7, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(Email7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(emailalert7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Department6, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 322, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(Department6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(Name7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MobileNo7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48)
                    .addComponent(mobilealert7))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailalert7)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EnterFacultyinternal.setViewportView(jPanel22);

        jPanel5.setPreferredSize(new java.awt.Dimension(668, 393));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Course Details", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 2, 14))); // NOI18N

        jLabel5.setText("Duration (in days) :");

        jLabel7.setText("Course Date :");

        jLabel14.setText("Fee :");

        name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name1ActionPerformed(evt);
            }
        });

        jLabel15.setText("Name :");

        Duration1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 14, 1));

        yearD1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970" }));

        monthD1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec" }));

        dateD1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel16.setText("/");

        jLabel17.setText("/");

        integeralert1.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        integeralert1.setForeground(new java.awt.Color(255, 0, 0));
        integeralert1.setText("Please enter numeric chars only  for Fee!  Or check the date");

        Dalert1.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        Dalert1.setForeground(new java.awt.Color(255, 0, 0));
        Dalert1.setText("Please enter a Valid Date !  (within 5 years from today )");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Duration1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fee1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(dateD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(monthD1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yearD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(integeralert1)
                            .addComponent(Dalert1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fee1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(integeralert1)
                .addGap(2, 2, 2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(dateD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Dalert1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Duration1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Course CoOrdinator Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 2, 14))); // NOI18N

        CheckBox.setText("Check to enter Course CoOrdinator Details");
        CheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxActionPerformed(evt);
            }
        });

        coordalert.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        coordalert.setForeground(new java.awt.Color(255, 0, 0));
        coordalert.setText("Please Enter the CoOrd details !");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckBox)
                    .addComponent(coordalert))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(coordalert))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Create Participants and Instructors", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 2, 14))); // NOI18N

        jLabel18.setText("Participants count :");

        jLabel19.setText("Instructors count :");

        Ins.setText("Create Instructors");
        Ins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsActionPerformed(evt);
            }
        });

        Partis.setText("Create Participants");
        Partis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PartisActionPerformed(evt);
            }
        });

        partiCount.setText("jLabel14");

        insCount.setText("jLabel15");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(insCount))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Partis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 83, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(partiCount))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(partiCount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Partis)
                .addGap(30, 30, 30)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(insCount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ins)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel23.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, null, null));

        Create.setText("Create");
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Create, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancel)
                    .addComponent(Create))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EnterCourseinternal.setViewportView(jPanel5);

        jLabel1.setFont(new java.awt.Font("Purisa", 2, 24)); // NOI18N
        jLabel1.setText("Welcome to Short Term Course Management Software");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("To Continue From the Previously saved work click on the button below");

        readfromfile.setText("Read From File");
        readfromfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readfromfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout emptyPanelLayout = new javax.swing.GroupLayout(emptyPanel);
        emptyPanel.setLayout(emptyPanelLayout);
        emptyPanelLayout.setHorizontalGroup(
            emptyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emptyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(emptyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(emptyPanelLayout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(readfromfile, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        emptyPanelLayout.setVerticalGroup(
            emptyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emptyPanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(readfromfile)
                .addGap(142, 142, 142))
        );

        jLayeredPane2.setLayer(EnterFacultyinternal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(EnterCourseinternal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(emptyPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EnterCourseinternal, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(EnterFacultyinternal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emptyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(EnterCourseinternal, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 67, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(EnterFacultyinternal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(emptyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(93, Short.MAX_VALUE)))
        );

        jSplitPane2.setRightComponent(jLayeredPane2);

        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu1.setText("File");

        readFile.setText("Read From File");
        readFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readFileActionPerformed(evt);
            }
        });
        jMenu1.add(readFile);

        jMenuItem11.setText("Write To File");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Create");

        jMenuItem1.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jMenuItem1.setText("Create Course");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Create Participant");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Create Instructor");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Display");

        jMenuItem6.setText("Display  All courses");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuItem7.setText("Display Particular Course");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuItem4.setText("Display Participants of a Course");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuItem5.setText("Display Instructors of a Course");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Alter");

        jMenu7.setText("Delete");

        jMenuItem13.setText("Delete Participant");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem13);

        jMenuItem14.setText("Delete instructor");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem14);

        jMenuItem15.setText("Delete Course");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem15);

        jMenu6.add(jMenu7);

        jMenuItem9.setText("Modify Course Details");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem9);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSplitPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSplitPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void partiToolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partiToolActionPerformed
        AlterForm part = new AlterForm();
        part.openPartisTab();
        part.setVisible(true);
        
    }//GEN-LAST:event_partiToolActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(STCM.getNoOfCourse()==10){
            JOptionPane.showMessageDialog(null,"Course limit 10 reached !");
            return;
        }
        emptyPanel.setVisible(false);
        EnterCourseinternal.setVisible(true);
        EnterFacultyinternal.setVisible(false);
        integeralert1.setText("      ");
        coordalert.setText("      ");
        Dalert1.setText("      ");
        insCount.setText("0");
        partiCount.setText("0");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        AlterForm part = new AlterForm();
        part.openPartisTab();
        part.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        DisplayForm form =new DisplayForm(3);
        form.setVisible(true);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        DisplayForm form =new DisplayForm(4);
        form.setVisible(true);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        DisplayForm form =new DisplayForm(1);
        form.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        DisplayForm form =new DisplayForm(2);
        form.setVisible(true);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem7ActionPerformed
        
    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        AlterForm part = new AlterForm();
        part.openmodifyTab();
        part.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        AlterForm part = new AlterForm();
        part.opendelPartisTab();
        part.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        super.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void Name7NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name7NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Name7NameActionPerformed

    private void Department6DepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Department6DepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Department6DepartmentActionPerformed

    private void MobileNo7MobileNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MobileNo7MobileNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MobileNo7MobileNoActionPerformed

    private void Email7EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Email7EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Email7EmailActionPerformed

    private void Submit7Submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit7Submit1ActionPerformed
        Faculty coord=new Faculty();
        try{
            coord.setMobileNo(String.format("%d",Long.parseLong(MobileNo7.getText())));
            mobilealert7.setVisible(false);
        }catch(Exception e){
            mobilealert7.setVisible(true);
            mobilealert7.setForeground(Color.red);
            mobilealert7.setFont(new Font("Serif",Font.ITALIC,14));
            return;
        }
        if(isValidEmailAddress(Email7.getText())){
            coord.setemail(Email7.getText());
            emailalert7.setVisible(false);
        }
        else{
            emailalert7.setVisible(true);
            emailalert7.setForeground(Color.red);
            emailalert7.setFont(new Font("Serif",Font.ITALIC,14));
            return;
        }
        if(Department6.getText().equals("")||(!isAlpha(Department6.getText()))){
            Border border;
            border = BorderFactory.createLineBorder(Color.RED);
            Department6.setBorder(border);
            Department6.setUI(new HintTextFieldUI("Plese enter Department !",true));
            return;
        }
        else{
            Border border = BorderFactory.createLineBorder(Color.BLACK);
            Department6.setBorder(border);
            coord.setDepartment(Department6.getText());

        }

        if(Name7.getText().equals("")||(!isAlpha(Name7.getText()))){
            Border border;
            border = BorderFactory.createLineBorder(Color.RED);
            Name7.setBorder(border);
            Name7.setUI(new HintTextFieldUI("Plese enter name !",true));
            return;
        }
        else{
            Border border = BorderFactory.createLineBorder(Color.BLACK);
            Name7.setBorder(border);
            coord.setName(Name7.getText());

        }
        System.out.printf("Hey");
        
        if(Address6.getText().equals("")){
            Border border;
            border = BorderFactory.createLineBorder(Color.RED);
            Address6.setBorder(border);
            Address6.setUI(new HintTextFieldUI("Plese enter name !",true));
            return;
        }
        else{
            Border border = BorderFactory.createLineBorder(Color.BLACK);
            Address6.setBorder(border);
            coord.setAddress(Address6.getText());
        }
        
        newcourse.CourseCoOrd = new Faculty();
        newcourse.setCourseCoOrd(coord);
        coord.getInfo();
        STCM.setCourseCoOrd(STCM.getNoOfCourse(),coord);
        EnterFacultyinternal.setVisible(false);
        jLayeredPane2.setVisible(false);
        jLayeredPane2.setVisible(true);
        EnterCourseinternal.setVisible(true);
        EnterFacultyinternal.setVisible(false);
    }//GEN-LAST:event_Submit7Submit1ActionPerformed

    private void Cancel8Cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel8Cancel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cancel8Cancel1ActionPerformed

    private void name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name1ActionPerformed

    }//GEN-LAST:event_name1ActionPerformed

    private void CheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxActionPerformed
        EnterFacultyinternal.setVisible(true);
        
        emptyPanel.setVisible(true);
        EnterCourseinternal.setVisible(false);
        mobilealert7.setVisible(false);
        emailalert7.setVisible(false);
    }//GEN-LAST:event_CheckBoxActionPerformed

    private void InsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsActionPerformed
        if(CheckBox.isSelected()==false){
            coordalert.setVisible(true);
            coordalert.setText("Please fill in CoOrd before adding Instructors !");
            return;
        }    
        coordalert.setVisible(false);
        AlterForm faculty = new AlterForm();
        if(newcourse.getNoOfIns()==5){
            return;
        }
        faculty.openInsTab(STCM.getNoOfCourse(),newcourse.getNoOfIns());
        faculty.setVisible(true);

        insCount.setText(String.format("%d",Integer.parseInt(insCount.getText())+1));
    }//GEN-LAST:event_InsActionPerformed

    private void PartisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PartisActionPerformed
        if(CheckBox.isSelected()==false){
            coordalert.setVisible(true);
            coordalert.setText("Please fill in CoOrd before adding Participants !");
            return;
        }    
        coordalert.setVisible(false);
        AlterForm part = new AlterForm();
        if(newcourse.getNoOfPartis()==5){
            return;
        }
        part.openPartisTab(STCM.getNoOfCourse(),newcourse.getNoOfPartis());
        part.setVisible(true);
        partiCount.setText(String.format("%d",Integer.parseInt(partiCount.getText())+1));
    }//GEN-LAST:event_PartisActionPerformed

    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateActionPerformed
        boolean check =false;
        newcourse =new Course();
        if(CheckBox.isSelected()==false){
            
            coordalert.setText("Please fill in CoOrd before adding Instructors !");
            coordalert.setText("Please enter CoOrd Details !");
            coordalert.setVisible(true);
            return;
        }
        
        
        if(name1.getText().equals("")||(!isAlpha(name1.getText()))){
            Border border;
            border = BorderFactory.createLineBorder(Color.RED);
            name1.setBorder(border);
            name1.setUI(new HintTextFieldUI("Please enter name here",true));
            return;
        }
        else{
            Border border = BorderFactory.createLineBorder(Color.BLACK);
            name1.setBorder(border);
            newcourse.setCourseName(name1.getText());
        }
        
        
        try{
            newcourse.setCourseFee(Long.parseLong(Fee1.getText()));
            int Ddate = Integer.parseInt(dateD1.getSelectedItem().toString());
            int Dmonth = monthD1.getSelectedIndex();
            int Dyear = (116 - yearD1.getSelectedIndex());
            System.out.println(Dyear);
            String x = String.format("%02d-%02d-%04d", Ddate, Dmonth + 1, 1900 + Dyear);
            
            newcourse.startinit();
            newcourse.getstart().setDate(Ddate);
            newcourse.getstart().setMonth(Dmonth);
            newcourse.getstart().setYear(Dyear);

            if (!isDateValid(x)||!STCM.checkDate(newcourse.getstart())) {
                Dalert1.setVisible(true);
                newcourse = null;
                return;
            
            }
            
            newcourse.setDuration((Integer)Duration1.getValue());
            check =false;
            
            System.out.printf("Successpart2");
            newcourse.NoOfPartis = Integer.parseInt(partiCount.getText());
            newcourse.NoOfIns = Integer.parseInt(insCount.getText());
            STCM.setCourse(STCM.getNoOfCourse(),newcourse);
            reset();
            EnterCourseinternal.setVisible(false);
            EnterFacultyinternal.setVisible(false);
            emptyPanel.setVisible(true);
            Dalert1.setVisible(false);
            setTreeCourse();
            }catch(Exception e){
            Font font =new Font("Serif",Font.ITALIC,14);
            integeralert1.setText("Please enter an integer for the above Or !");
            Dalert1.setVisible(true);
            integeralert1.setFont(font);
            integeralert1.setForeground(Color.RED);
            integeralert1.setVisible(true);
            integeralert1.setFont(font);
            check =true;            
        }
        try {
            STCM.filewrite();
        } catch (IOException ex) {
            Logger.getLogger(MainCourses.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CreateActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        AlterForm part = new AlterForm();
        part.openInsTab();
        part.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        AlterForm part = new AlterForm();
        part.opendelInsTab();
        part.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        AlterForm part = new AlterForm();
        part.opendelCourseTab();
        part.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void readfromfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readfromfileActionPerformed
        STCM.fileparse();
        System.out.println(STCM.getNoOfCourse());
        DefaultTreeModel model = (DefaultTreeModel) courseTree.getModel();
        for(int j=0;j<STCM.getNoOfCourse();j++){
            setTreeCourse(model,j);
        }
 
    }//GEN-LAST:event_readfromfileActionPerformed

    private void newfileToolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newfileToolActionPerformed
        if(STCM.getNoOfCourse()==10){
            JOptionPane.showMessageDialog(null,"Course limit 10 reached !");
            return;
        }
        emptyPanel.setVisible(false);
        EnterCourseinternal.setVisible(true);
        EnterFacultyinternal.setVisible(false);
        integeralert1.setText("      ");
        coordalert.setText("      ");
        Dalert1.setText("      ");
        insCount.setText("0");
        partiCount.setText("0");
    }//GEN-LAST:event_newfileToolActionPerformed

    private void readToolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readToolActionPerformed
        STCM.fileparse();
    }//GEN-LAST:event_readToolActionPerformed

    private void insToolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insToolActionPerformed
        AlterForm part = new AlterForm();
        part.openInsTab();
        part.setVisible(true);
        
    }//GEN-LAST:event_insToolActionPerformed

    private void readFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readFileActionPerformed
        STCM.fileparse();
        System.out.println(STCM.getNoOfCourse());
        DefaultTreeModel model = (DefaultTreeModel) courseTree.getModel();
        for(int j=0;j<STCM.getNoOfCourse();j++){
            setTreeCourse(model,j);
        }
        emptyPanel.setVisible(false);
    }//GEN-LAST:event_readFileActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        try {
            STCM.filewrite();
        } catch (IOException ex) {
            Logger.getLogger(MainCourses.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem11ActionPerformed
    
    public boolean isAlpha(String name) {
        char[] chars = name.toCharArray();

        for (char c : chars) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }
    
    
    final static String DATE_FORMAT = "dd-MM-yyyy";

    public static boolean isDateValid(String date) {
        try {
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
    
    
    public boolean isValidEmailAddress(String email) {
           String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
           java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
           java.util.regex.Matcher m = p.matcher(email);
           return m.matches();
    }
    
    private DefaultMutableTreeNode findNode(DefaultMutableTreeNode root, String s) {
        @SuppressWarnings("unchecked")
        Enumeration<DefaultMutableTreeNode> e = root.depthFirstEnumeration();
        while (e.hasMoreElements()) {
            DefaultMutableTreeNode node = e.nextElement();
            if (node.toString().equalsIgnoreCase(s)) {
                return node;
            }
        }
        return null;
    }
    
    
    
    private TreePath findPath(DefaultMutableTreeNode root, String s) {
        @SuppressWarnings("unchecked")
        Enumeration<DefaultMutableTreeNode> e = root.depthFirstEnumeration();
        while (e.hasMoreElements()) {
            DefaultMutableTreeNode node = e.nextElement();
            if (node.toString().equalsIgnoreCase(s)) {
                return new TreePath(node.getPath());
            }
        }
        return null;
    }
    
    public void setTreeCourse(){
        DefaultTreeModel model = (DefaultTreeModel) courseTree.getModel();
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) model.getRoot();
        DefaultMutableTreeNode rootCoOrd =(DefaultMutableTreeNode) model.getRoot();
        DefaultMutableTreeNode rootParti =(DefaultMutableTreeNode) model.getRoot();
        DefaultMutableTreeNode rootIns =(DefaultMutableTreeNode) model.getRoot();
        
        String x = String.format("Course : %d",STCM.getNoOfCourse());
        root.add(new DefaultMutableTreeNode(x));
        
        System.out.println(String.format("ffffff : %d",STCM.getNoOfCourse()));
        root=findNode(root,x);
        
        rootCoOrd=root;
        rootParti=root;
        rootIns=root;
        
        root.add(new DefaultMutableTreeNode(STCM.getallcourses(STCM.getNoOfCourse()-1).getcourseName()));
        
        System.out.println("fffffffff1");
        root.add(new DefaultMutableTreeNode(STCM.getallcourses(STCM.getNoOfCourse()-1).getCourseFee()));
        root.add(new DefaultMutableTreeNode(STCM.getallcourses(STCM.getNoOfCourse()-1).getDuration()));
        root.add(new DefaultMutableTreeNode(STCM.getallcourses(STCM.getNoOfCourse()-1).getstart()));
        
        root.add(new DefaultMutableTreeNode("Course CoOrd"));
        rootCoOrd=findNode(rootCoOrd,"Course CoOrd");
        
        rootCoOrd.add(new DefaultMutableTreeNode("Department :"+STCM.getallcourses(STCM.getNoOfCourse()-1).getCoOrdAsWhole().getDepartment()));
        
        rootCoOrd.add(new DefaultMutableTreeNode("CoOrd Name :"+STCM.getallcourses(STCM.getNoOfCourse()-1).getCoOrdAsWhole().getName()));
        rootCoOrd.add(new DefaultMutableTreeNode("Address : "+STCM.getallcourses(STCM.getNoOfCourse()-1).getCoOrdAsWhole().getAddress()));
        rootCoOrd.add(new DefaultMutableTreeNode("MobileNo :"+STCM.getallcourses(STCM.getNoOfCourse()-1).getCoOrdAsWhole().getMobileNo()));
        rootCoOrd.add(new DefaultMutableTreeNode("Email ID :"+STCM.getallcourses(STCM.getNoOfCourse()-1).getCoOrdAsWhole().getemail()));
        
        root.add(new DefaultMutableTreeNode("Participants"));
        rootParti=findNode(rootParti,"Participants");
        for(int i=0;i<STCM.getallcourses(STCM.getNoOfCourse()-1).getNoOfPartis();i++){
            rootParti.add(new DefaultMutableTreeNode("Participant"+(i+1)));
            DefaultMutableTreeNode dummy;
            dummy=findNode(rootParti,"Participant"+(i+1));
            dummy.add(new DefaultMutableTreeNode("Name :"+STCM.getallcourses(STCM.getNoOfCourse()-1).getParticipantAsWhole(i).getName()));
            dummy.add(new DefaultMutableTreeNode("Address :"+STCM.getallcourses(STCM.getNoOfCourse()-1).getParticipantAsWhole(i).getAddress()));
            dummy.add(new DefaultMutableTreeNode("MobileNo : "+STCM.getallcourses(STCM.getNoOfCourse()-1).getParticipantAsWhole(i).getMobileNo()));
            dummy.add(new DefaultMutableTreeNode("Org Name :"+STCM.getallcourses(STCM.getNoOfCourse()-1).getParticipantAsWhole(i).getOrgName()));
            dummy.add(new DefaultMutableTreeNode("Email ID :"+STCM.getallcourses(STCM.getNoOfCourse()-1).getParticipantAsWhole(i).getemail()));
        }
        root.add(new DefaultMutableTreeNode("Instructors"));
        rootIns=findNode(rootIns,"Instructors");
        for(int i=0;i<STCM.getallcourses(STCM.getNoOfCourse()-1).getNoOfIns();i++){
            rootIns.add(new DefaultMutableTreeNode("Instructor"+(i+1)));
            DefaultMutableTreeNode dummy;
            dummy=findNode(rootIns,"Instructor"+(i+1));
            dummy.add(new DefaultMutableTreeNode("Department :"+STCM.getallcourses(STCM.getNoOfCourse()-1).getInstructorAsWhole(i).getDepartment()));
            dummy.add(new DefaultMutableTreeNode("CoOrd Name :"+STCM.getallcourses(STCM.getNoOfCourse()-1).getInstructorAsWhole(i).getName()));
            dummy.add(new DefaultMutableTreeNode("Address : "+STCM.getallcourses(STCM.getNoOfCourse()-1).getInstructorAsWhole(i).getAddress()));
            dummy.add(new DefaultMutableTreeNode("MobileNo :"+STCM.getallcourses(STCM.getNoOfCourse()-1).getInstructorAsWhole(i).getMobileNo()));
            dummy.add(new DefaultMutableTreeNode("Email ID :"+STCM.getallcourses(STCM.getNoOfCourse()-1).getInstructorAsWhole(i).getemail()));
        }
        model.reload();
    }
    
    public void reset(){
        name1.setText("");
        Fee1.setText("");
        dateD1.setSelectedIndex(0);
        monthD1.setSelectedIndex(0);
        yearD1.setSelectedIndex(0);
        Duration1.setValue(0);
        insCount.setText("0");
        partiCount.setText("0");
        CheckBox.setSelected(false);
        Department6.setText("");
        Address6.setText("");
        Name7.setText("");
        MobileNo7.setText("");
        Email7.setText("");
    }
    
    
    private int enterinteger(){
        int integer;
        boolean check;
        do{
        try{
            integer=Integer.parseInt(JOptionPane.showInputDialog("Please Enter the number of courses"));
            return integer;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Please enter an Integer !");
        }}while(true);
        
    }

    
    
    
    public void setTreeCourse(DefaultTreeModel model,int j){
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) model.getRoot();
        DefaultMutableTreeNode rootCoOrd =(DefaultMutableTreeNode) model.getRoot();
        DefaultMutableTreeNode rootParti =(DefaultMutableTreeNode) model.getRoot();
        DefaultMutableTreeNode rootIns =(DefaultMutableTreeNode) model.getRoot();
        
        String x = String.format("Course : %d",j+1);
        root.add(new DefaultMutableTreeNode(x));
        
        System.out.println(String.format("ffffff : %d p%d i%d",STCM.getNoOfCourse(),STCM.getallcourses(STCM.getNoOfCourse()-1).getNoOfPartis(),STCM.getallcourses(STCM.getNoOfCourse()-1).getNoOfIns()));
        root=findNode(root,x);
        
        rootCoOrd=root;
        rootParti=root;
        rootIns=root;
        
        root.add(new DefaultMutableTreeNode(STCM.getallcourses(j).getcourseName()));
        root.add(new DefaultMutableTreeNode(STCM.getallcourses(j).getCourseFee()));
        root.add(new DefaultMutableTreeNode(STCM.getallcourses(j).getDuration()));
        root.add(new DefaultMutableTreeNode(STCM.getallcourses(j).getstart()));
        
        root.add(new DefaultMutableTreeNode("Course CoOrd"));
        rootCoOrd=findNode(rootCoOrd,"Course CoOrd");
        
        rootCoOrd.add(new DefaultMutableTreeNode("Department :"+STCM.getallcourses(j).getCoOrdAsWhole().getDepartment()));
        
        
        rootCoOrd.add(new DefaultMutableTreeNode("CoOrd Name :"+STCM.getallcourses(j).getCoOrdAsWhole().getName()));
        rootCoOrd.add(new DefaultMutableTreeNode("Address : "+STCM.getallcourses(j).getCoOrdAsWhole().getAddress()));
        rootCoOrd.add(new DefaultMutableTreeNode("MobileNo :"+STCM.getallcourses(j).getCoOrdAsWhole().getMobileNo()));
        rootCoOrd.add(new DefaultMutableTreeNode("Email ID :"+STCM.getallcourses(j).getCoOrdAsWhole().getemail()));
        
        root.add(new DefaultMutableTreeNode("Participants"));
        rootParti=findNode(rootParti,"Participants");
        for(int i=0;i<STCM.getallcourses(j).getNoOfPartis();i++){
            rootParti.add(new DefaultMutableTreeNode("Participant"+(i+1)));
            DefaultMutableTreeNode dummy;
            System.out.println("Ingtttt");
            dummy=findNode(rootParti,"Participant"+(i+1));
            dummy.add(new DefaultMutableTreeNode("Name :"+STCM.getallcourses(j).getParticipantAsWhole(i).getName()));
            dummy.add(new DefaultMutableTreeNode("Address :"+STCM.getallcourses(j).getParticipantAsWhole(i).getAddress()));
            dummy.add(new DefaultMutableTreeNode("MobileNo : "+STCM.getallcourses(j).getParticipantAsWhole(i).getMobileNo()));
            dummy.add(new DefaultMutableTreeNode("Org Name :"+STCM.getallcourses(j).getParticipantAsWhole(i).getOrgName()));
            dummy.add(new DefaultMutableTreeNode("Email ID :"+STCM.getallcourses(j).getParticipantAsWhole(i).getemail()));
        }
        root.add(new DefaultMutableTreeNode("Instructors"));
        rootIns=findNode(rootIns,"Instructors");
        for(int i=0;i<STCM.getallcourses(j).getNoOfIns();i++){
            rootIns.add(new DefaultMutableTreeNode("Instructor"+(i+1)));
            DefaultMutableTreeNode dummy;
            dummy=findNode(rootIns,"Instructor"+(i+1));
            dummy.add(new DefaultMutableTreeNode("Department :"+STCM.getallcourses(j).getInstructorAsWhole(i).getDepartment()));
            dummy.add(new DefaultMutableTreeNode("CoOrd Name :"+STCM.getallcourses(j).getInstructorAsWhole(i).getName()));
            dummy.add(new DefaultMutableTreeNode("Address : "+STCM.getallcourses(j).getInstructorAsWhole(i).getAddress()));
            dummy.add(new DefaultMutableTreeNode("MobileNo :"+STCM.getallcourses(j).getInstructorAsWhole(i).getMobileNo()));
            dummy.add(new DefaultMutableTreeNode("Email ID :"+STCM.getallcourses(j).getInstructorAsWhole(i).getemail()));
        }
        model.reload();
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Address6;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Cancel8;
    private javax.swing.JCheckBox CheckBox;
    private javax.swing.JButton Create;
    private javax.swing.JLabel Dalert1;
    private javax.swing.JTextField Department6;
    private javax.swing.JSpinner Duration1;
    private javax.swing.JTextField Email7;
    private javax.swing.JScrollPane EnterCourseinternal;
    private javax.swing.JScrollPane EnterFacultyinternal;
    private javax.swing.JTextField Fee1;
    private javax.swing.JButton Ins;
    private javax.swing.JTextField MobileNo7;
    private javax.swing.JTextField Name7;
    private javax.swing.JButton Partis;
    private javax.swing.JButton Submit7;
    private javax.swing.JToolBar ToolBar;
    private javax.swing.JLabel coordalert;
    private javax.swing.JTree courseTree;
    private javax.swing.JComboBox<String> dateD1;
    private javax.swing.JLabel emailalert7;
    private javax.swing.JPanel emptyPanel;
    private javax.swing.JMenuItem exit;
    private javax.swing.JLabel insCount;
    private javax.swing.JButton insTool;
    private javax.swing.JLabel integeralert1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel mobilealert7;
    private javax.swing.JComboBox<String> monthD1;
    private javax.swing.JTextField name1;
    private javax.swing.JButton newfileTool;
    private javax.swing.JLabel partiCount;
    private javax.swing.JButton partiTool;
    private javax.swing.JMenuItem readFile;
    private javax.swing.JButton readTool;
    private javax.swing.JButton readfromfile;
    private javax.swing.JComboBox<String> yearD1;
    // End of variables declaration//GEN-END:variables
    
}
