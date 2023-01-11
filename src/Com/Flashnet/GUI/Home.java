package Com.Flashnet.GUI;

import Com.Flashnet.Common.IcommonGUI;
import Com.Flashnet.DAO.AreaDAO;
import Com.Flashnet.DAO.CreateCustomerDAO;
import Com.Flashnet.DAO.PackagesDAO;
import Com.Flashnet.DAO.ConnectionDAO;
import Com.Flashnet.DAO.CustomerDAO;
import Com.Flashnet.Model.Area;
import Com.Flashnet.Model.ConnectioN;
import Com.Flashnet.Model.CreateCustomer;
import Com.Flashnet.Model.Customer;
import Com.Flashnet.Model.Packages;
import Com.Flashnet.Util.DBC;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;


public class Home extends javax.swing.JFrame implements IcommonGUI{
    PackagesDAO packDAO;
    DefaultTableModel packageModel, connectionModel, areaModel, areaModel2, subAreaModel, 
            customerModel, customerModel2, paymentModel, payModel1, payModel2;
    AreaDAO areaDAO;
    CreateCustomerDAO ccDAO;
    ConnectionDAO cnDAO;
    CustomerDAO cDAO;
    
    public Home() {
        initComponents();
//         <<<< Home Section >>>>
        showPieChart();
        showBarChart();
        activeStatus();
        inactiveStatus();
//          <<<<Package section>>>>>
        packDAO = new PackagesDAO();
        loadPackBox();
        loadPackBox2();
//          <<<<Area Section>>>>
        areaModel = new DefaultTableModel();
        areaModel2 = new DefaultTableModel();
        subAreaModel = new DefaultTableModel();
        areaDAO = new AreaDAO();
        loadAreaBox10();
        loadSubAreaBox11();
        
//         <<<<Create Customer Section>>>
        ccDAO = new CreateCustomerDAO();
        loadAreaBox4();
        loadPackBox5();
        loadAreaBox8();
        
//         <<<<Connection Section>>>>
        cnDAO = new ConnectionDAO();
        loadPackBox3();
        
//        <<<<Customer Section>>>>
        cDAO = new CustomerDAO();
        
//         <<<<Profile Update Section>>>>
        loadPackBox6();
        loadPackBox7();
        loadSubAreaBox9();
    }
    
    
//          <<<<Package section>>>>>
    List<Packages> getPackages(){
        PackagesDAO packDAO = new PackagesDAO();
        return packDAO.get();
    }
    public void loadPackBox(){
        List<Packages> packs = getPackages();
        packBox.removeAllItems();
        for(int i=0; i<packs.size(); i++){
            packBox.addItem(packs.get(i).getPackageId());
        }
    }
    public void loadPackBox2(){
        List<Packages> pack = getPackages();
        packBox2.removeAllItems();
        for(int i=0; i<pack.size(); i++){
            packBox2.addItem(pack.get(i).getPackageId());
        }
    }
    
//        <<<<Create Customer Section>>>>
    public void loadAreaBox4(){
        List<Area> are = getArea();
        _customerArea.removeAllItems();
        for (int i = 0; i < are.size(); i++) {
            _customerArea.addItem(are.get(i).getAreaName());
        }
    }
    public void loadPackBox5(){
        List<Packages> PAK = getPackages();
        _customerPackId.removeAllItems();
        for(int i=0; i<PAK.size(); i++){
            _customerPackId.addItem(PAK.get(i).getPackageId());
        }
    }
    public void loadAreaBox8(){
        List<Area> aRE = getArea();
        _SUBArea.removeAllItems();
        for (int i = 0; i < aRE.size(); i++) {
            _SUBArea.addItem(aRE.get(i).getSubAreaName());
        }
    }
//       <<<<Area Section>>>>
    List<Area> getArea(){
        AreaDAO arDAO = new AreaDAO();
        return arDAO.get();
    }
    public void loadAreaBox10(){
        List<Area> area = getArea();
        arAreaName.removeAllItems();
        for (int i = 0; i < area.size(); i++) {
            arAreaName.addItem(area.get(i).getAreaName());
        }
    }
    public void loadSubAreaBox11(){
        List<Area> aRE = getArea();
        arSubAreaName.removeAllItems();
        for (int i = 0; i < aRE.size(); i++) {
            arSubAreaName.addItem(aRE.get(i).getSubAreaName());
        }
    }
//         <<<<Connection Section>>>>
    public void loadPackBox3(){
        List<Packages> PK = getPackages();
        _cPackId.removeAllItems();
        for(int i=0; i<PK.size(); i++){
        _cPackId.addItem(PK.get(i).getPackageId());
        }
    }
//         <<<<Profile Update Section>>>>
    public void loadPackBox6(){
        List<Area> ARE = getArea();
        puAreaName.removeAllItems();
        for (int i = 0; i < ARE.size(); i++) {
            puAreaName.addItem(ARE.get(i).getAreaName());
        }
    }
    public void loadPackBox7(){
        List<Packages> PAK = getPackages();
        puPackId.removeAllItems();
        for(int i=0; i<PAK.size(); i++){
            puPackId.addItem(PAK.get(i).getPackageId());
        }
    }
    public void loadSubAreaBox9(){
        List<Area> arE = getArea();
        puSubAreaName.removeAllItems();
        for (int i = 0; i < arE.size(); i++) {
            puSubAreaName.addItem(arE.get(i).getSubAreaName());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        sidePanel = new keeptoo.KGradientPanel();
        jButton12 = new javax.swing.JButton();
        _customerInfoButton = new javax.swing.JButton();
        _packagesButton = new javax.swing.JButton();
        _dashboardButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        _connectionButton = new javax.swing.JButton();
        _areaCoverageButton = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        mainTopPanel = new javax.swing.JPanel();
        forHome = new keeptoo.KGradientPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        _logout15 = new javax.swing.JButton();
        _profile15 = new javax.swing.JButton();
        forArea = new keeptoo.KGradientPanel();
        jButton15 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        _logout20 = new javax.swing.JButton();
        _profile25 = new javax.swing.JButton();
        _profile26 = new javax.swing.JButton();
        forPackages = new keeptoo.KGradientPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        _logout16 = new javax.swing.JButton();
        _profile16 = new javax.swing.JButton();
        _operationsButton = new javax.swing.JButton();
        forCustomer = new keeptoo.KGradientPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        _logout17 = new javax.swing.JButton();
        _profile17 = new javax.swing.JButton();
        _profile19 = new javax.swing.JButton();
        _profile21 = new javax.swing.JButton();
        forConnection = new keeptoo.KGradientPanel();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        _logout21 = new javax.swing.JButton();
        _profile36 = new javax.swing.JButton();
        forPayment = new keeptoo.KGradientPanel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        _logout18 = new javax.swing.JButton();
        _profile22 = new javax.swing.JButton();
        _profile24 = new javax.swing.JButton();
        forProduct = new keeptoo.KGradientPanel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        _logout19 = new javax.swing.JButton();
        _profile27 = new javax.swing.JButton();
        _profile31 = new javax.swing.JButton();
        _profile32 = new javax.swing.JButton();
        forReport = new keeptoo.KGradientPanel();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        _logout22 = new javax.swing.JButton();
        _profile41 = new javax.swing.JButton();
        _profile43 = new javax.swing.JButton();
        forSettings = new keeptoo.KGradientPanel();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        _logout23 = new javax.swing.JButton();
        _profile46 = new javax.swing.JButton();
        mainScrollPane1 = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
        _home = new javax.swing.JPanel();
        panelPieChart = new javax.swing.JPanel();
        panelBarChart = new javax.swing.JPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel88 = new javax.swing.JLabel();
        ac = new javax.swing.JLabel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jLabel87 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        jLabel85 = new javax.swing.JLabel();
        ic = new javax.swing.JLabel();
        _area = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        arAreaName = new javax.swing.JComboBox();
        jScrollPane6 = new javax.swing.JScrollPane();
        assignAreaTable = new javax.swing.JTable();
        jLabel48 = new javax.swing.JLabel();
        arSubAreaName = new javax.swing.JComboBox();
        jLabel81 = new javax.swing.JLabel();
        _addArea = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        _areaId = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        _areaName = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        _subArea = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        _conType = new javax.swing.JTextField();
        jButton31 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        _deleteAreaId = new javax.swing.JTextField();
        _deleteArea = new javax.swing.JButton();
        _packages = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        packageTable = new javax.swing.JTable();
        jLabel59 = new javax.swing.JLabel();
        _addPackages = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        packName = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        bandWidth = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        packCost = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        packDuration = new javax.swing.JTextField();
        _packageCreateButton = new javax.swing.JButton();
        _packageCancelButton = new javax.swing.JButton();
        packId = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        packBox = new javax.swing.JComboBox();
        jLabel62 = new javax.swing.JLabel();
        setpackNameById = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        setBandwidthById = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        setPackCostById = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        setDurationById = new javax.swing.JTextField();
        jButton38 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        packBox2 = new javax.swing.JComboBox();
        jButton43 = new javax.swing.JButton();
        _customer = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        _customerId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        _customerPhone = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        _customerArea = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        _customerPackId = new javax.swing.JComboBox();
        jLabel39 = new javax.swing.JLabel();
        _customerPackCost = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        _customerName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        _customerEmail = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        _customerAddress = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        _customerInstallationDate = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        _SUBArea = new javax.swing.JComboBox();
        jLabel36 = new javax.swing.JLabel();
        _customerPackName = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        _CustomerBandwidth = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        _customerConType = new javax.swing.JTextField();
        _customerPackDuration = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        _customerProfile = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        searchCustId = new javax.swing.JTextField();
        jButton30 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        assignCustomerTable = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        assignCustTable2 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        _profileUpdate = new javax.swing.JPanel();
        _customer1 = new javax.swing.JPanel();
        catchCustId = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        puCustId = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        puCustPhone = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        puAreaName = new javax.swing.JComboBox();
        jLabel29 = new javax.swing.JLabel();
        puPackId = new javax.swing.JComboBox();
        jLabel47 = new javax.swing.JLabel();
        puPackCost = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        puCustName = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        puCustEmail = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        puCustAddress = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        puInstallationDate = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        puSubAreaName = new javax.swing.JComboBox();
        jLabel67 = new javax.swing.JLabel();
        puPackName = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        puBandwidth = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        puConType = new javax.swing.JTextField();
        puPackDuration = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jButton33 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        _connection = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        _cPackId = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        _cId = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        _cStartDate = new com.toedter.calendar.JDateChooser();
        jLabel44 = new javax.swing.JLabel();
        _cEndDate = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        _cAuto = new javax.swing.JCheckBox();
        _cManual = new javax.swing.JCheckBox();
        jLabel35 = new javax.swing.JLabel();
        _cActive = new javax.swing.JCheckBox();
        _cInactive = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        assignPackTable = new javax.swing.JTable();
        jLabel83 = new javax.swing.JLabel();
        _payment = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        payName = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        payBand = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        payTable = new javax.swing.JTable();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        cash = new javax.swing.JTextField();
        due = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton35 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        queryBox = new javax.swing.JTextField();
        queryButton = new javax.swing.JButton();
        _paymentHistory = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        pay_cust_id = new javax.swing.JTextField();
        jButton36 = new javax.swing.JButton();
        jLabel84 = new javax.swing.JLabel();
        pay_paid = new javax.swing.JCheckBox();
        jButton37 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        Ptable1 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        Ptable2 = new javax.swing.JTable();
        jLabel86 = new javax.swing.JLabel();
        _product = new javax.swing.JPanel();
        _saleReport = new javax.swing.JPanel();
        _purchaseReport = new javax.swing.JPanel();
        _report = new javax.swing.JPanel();
        _pendingReport = new javax.swing.JPanel();
        _settings = new javax.swing.JPanel();
        _profile = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setkEndColor(new java.awt.Color(20, 30, 48));
        sidePanel.setkStartColor(new java.awt.Color(36, 59, 85));

        jButton12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-cash-22.png"))); // NOI18N
        jButton12.setText("PAYMENT");
        jButton12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        _customerInfoButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        _customerInfoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-customer-review-22.png"))); // NOI18N
        _customerInfoButton.setText("CUSTOMER INFO");
        _customerInfoButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        _customerInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _customerInfoButtonActionPerformed(evt);
            }
        });

        _packagesButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        _packagesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-gift-box-22.png"))); // NOI18N
        _packagesButton.setText("PACKAGES");
        _packagesButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        _packagesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _packagesButtonActionPerformed(evt);
            }
        });

        _dashboardButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        _dashboardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-home-22.png"))); // NOI18N
        _dashboardButton.setText("DASHBOARD");
        _dashboardButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        _dashboardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _dashboardButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADMIN DESK");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-user-60.png"))); // NOI18N

        jButton16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-shopping-cart-22.png"))); // NOI18N
        jButton16.setText("PRODUCT");
        jButton16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        _connectionButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        _connectionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-antena-dish-22.png"))); // NOI18N
        _connectionButton.setText("CONNECTION");
        _connectionButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        _connectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _connectionButtonActionPerformed(evt);
            }
        });

        _areaCoverageButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        _areaCoverageButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-location-22.png"))); // NOI18N
        _areaCoverageButton.setText("AREA COVERAGE");
        _areaCoverageButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        _areaCoverageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _areaCoverageButtonActionPerformed(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-report-22.png"))); // NOI18N
        jButton19.setText("REPORT");
        jButton19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-settings-22.png"))); // NOI18N
        jButton20.setText("SETTINGS");
        jButton20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(_dashboardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(_packagesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(_customerInfoButton, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(_areaCoverageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(_connectionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(_dashboardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(_areaCoverageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(_packagesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(_customerInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(_connectionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        getContentPane().add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 700));

        mainTopPanel.setLayout(new java.awt.CardLayout());

        forHome.setkEndColor(new java.awt.Color(20, 30, 48));
        forHome.setkStartColor(new java.awt.Color(36, 59, 85));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-close-20.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-subtract-20.png"))); // NOI18N

        _logout15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        _logout15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-shutdown-22.png"))); // NOI18N
        _logout15.setText("LOGOUT");

        _profile15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        _profile15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-customer-22.png"))); // NOI18N
        _profile15.setText("PROFILE");

        javax.swing.GroupLayout forHomeLayout = new javax.swing.GroupLayout(forHome);
        forHome.setLayout(forHomeLayout);
        forHomeLayout.setHorizontalGroup(
            forHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forHomeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forHomeLayout.createSequentialGroup()
                .addContainerGap(821, Short.MAX_VALUE)
                .addComponent(_profile15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_logout15)
                .addContainerGap())
        );
        forHomeLayout.setVerticalGroup(
            forHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forHomeLayout.createSequentialGroup()
                .addGroup(forHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(forHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_logout15)
                    .addComponent(_profile15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        mainTopPanel.add(forHome, "card2");

        forArea.setkEndColor(new java.awt.Color(20, 30, 48));
        forArea.setkStartColor(new java.awt.Color(36, 59, 85));

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-close-20.png"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-subtract-20.png"))); // NOI18N

        _logout20.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        _logout20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-shutdown-22.png"))); // NOI18N
        _logout20.setText("LOGOUT");

        _profile25.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        _profile25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-customer-22.png"))); // NOI18N
        _profile25.setText("PROFILE");

        _profile26.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        _profile26.setText("ADD AREA");
        _profile26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _profile26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout forAreaLayout = new javax.swing.GroupLayout(forArea);
        forArea.setLayout(forAreaLayout);
        forAreaLayout.setHorizontalGroup(
            forAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forAreaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(_profile26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 704, Short.MAX_VALUE)
                .addComponent(_profile25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_logout20)
                .addContainerGap())
        );
        forAreaLayout.setVerticalGroup(
            forAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forAreaLayout.createSequentialGroup()
                .addGroup(forAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forAreaLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(forAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_profile25)
                    .addComponent(_logout20)
                    .addComponent(_profile26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        mainTopPanel.add(forArea, "card2");

        forPackages.setkEndColor(new java.awt.Color(20, 30, 48));
        forPackages.setkStartColor(new java.awt.Color(36, 59, 85));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-close-20.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-subtract-20.png"))); // NOI18N

        _logout16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        _logout16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-shutdown-22.png"))); // NOI18N
        _logout16.setText("LOGOUT");

        _profile16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        _profile16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-customer-22.png"))); // NOI18N
        _profile16.setText("PROFILE");

        _operationsButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        _operationsButton.setText("OPERATIONS");
        _operationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _operationsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout forPackagesLayout = new javax.swing.GroupLayout(forPackages);
        forPackages.setLayout(forPackagesLayout);
        forPackagesLayout.setHorizontalGroup(
            forPackagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forPackagesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forPackagesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(_operationsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 673, Short.MAX_VALUE)
                .addComponent(_profile16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_logout16)
                .addContainerGap())
        );
        forPackagesLayout.setVerticalGroup(
            forPackagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forPackagesLayout.createSequentialGroup()
                .addGroup(forPackagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(forPackagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_logout16)
                    .addComponent(_profile16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forPackagesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(_operationsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainTopPanel.add(forPackages, "card2");

        forCustomer.setkEndColor(new java.awt.Color(20, 30, 48));
        forCustomer.setkStartColor(new java.awt.Color(36, 59, 85));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-close-20.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-subtract-20.png"))); // NOI18N

        _logout17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        _logout17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-shutdown-22.png"))); // NOI18N
        _logout17.setText("LOGOUT");

        _profile17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        _profile17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-customer-22.png"))); // NOI18N
        _profile17.setText("PROFILE");

        _profile19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        _profile19.setText("PROFILE");
        _profile19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _profile19ActionPerformed(evt);
            }
        });

        _profile21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        _profile21.setText("PROFILE UPDATE");
        _profile21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _profile21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout forCustomerLayout = new javax.swing.GroupLayout(forCustomer);
        forCustomer.setLayout(forCustomerLayout);
        forCustomerLayout.setHorizontalGroup(
            forCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forCustomerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(_profile19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(_profile21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 555, Short.MAX_VALUE)
                .addComponent(_profile17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_logout17)
                .addContainerGap())
        );
        forCustomerLayout.setVerticalGroup(
            forCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forCustomerLayout.createSequentialGroup()
                .addGroup(forCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forCustomerLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(forCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_profile17)
                    .addComponent(_logout17)
                    .addComponent(_profile19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(_profile21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        mainTopPanel.add(forCustomer, "card2");

        forConnection.setkEndColor(new java.awt.Color(20, 30, 48));
        forConnection.setkStartColor(new java.awt.Color(36, 59, 85));

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-close-20.png"))); // NOI18N
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-subtract-20.png"))); // NOI18N

        _logout21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        _logout21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-shutdown-22.png"))); // NOI18N
        _logout21.setText("LOGOUT");

        _profile36.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        _profile36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-customer-22.png"))); // NOI18N
        _profile36.setText("PROFILE");

        javax.swing.GroupLayout forConnectionLayout = new javax.swing.GroupLayout(forConnection);
        forConnection.setLayout(forConnectionLayout);
        forConnectionLayout.setHorizontalGroup(
            forConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forConnectionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forConnectionLayout.createSequentialGroup()
                .addGap(21, 821, Short.MAX_VALUE)
                .addComponent(_profile36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_logout21)
                .addContainerGap())
        );
        forConnectionLayout.setVerticalGroup(
            forConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forConnectionLayout.createSequentialGroup()
                .addGroup(forConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(forConnectionLayout.createSequentialGroup()
                        .addGroup(forConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forConnectionLayout.createSequentialGroup()
                        .addContainerGap(68, Short.MAX_VALUE)
                        .addGroup(forConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(_profile36)
                            .addComponent(_logout21))))
                .addContainerGap())
        );

        mainTopPanel.add(forConnection, "card2");

        forPayment.setkEndColor(new java.awt.Color(20, 30, 48));
        forPayment.setkStartColor(new java.awt.Color(36, 59, 85));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-close-20.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-subtract-20.png"))); // NOI18N

        _logout18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        _logout18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-shutdown-22.png"))); // NOI18N
        _logout18.setText("LOGOUT");

        _profile22.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        _profile22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-customer-22.png"))); // NOI18N
        _profile22.setText("PROFILE");

        _profile24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        _profile24.setText("PAYMENT HISTORY");
        _profile24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _profile24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout forPaymentLayout = new javax.swing.GroupLayout(forPayment);
        forPayment.setLayout(forPaymentLayout);
        forPaymentLayout.setHorizontalGroup(
            forPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forPaymentLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forPaymentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(_profile24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 644, Short.MAX_VALUE)
                .addComponent(_profile22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_logout18)
                .addContainerGap())
        );
        forPaymentLayout.setVerticalGroup(
            forPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forPaymentLayout.createSequentialGroup()
                .addGroup(forPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forPaymentLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(forPaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_profile22)
                    .addComponent(_logout18)
                    .addComponent(_profile24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        mainTopPanel.add(forPayment, "card2");

        forProduct.setkEndColor(new java.awt.Color(20, 30, 48));
        forProduct.setkStartColor(new java.awt.Color(36, 59, 85));

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-close-20.png"))); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-subtract-20.png"))); // NOI18N

        _logout19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        _logout19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-shutdown-22.png"))); // NOI18N
        _logout19.setText("LOGOUT");

        _profile27.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        _profile27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-customer-22.png"))); // NOI18N
        _profile27.setText("PROFILE");

        _profile31.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        _profile31.setText("SALE REPORT");
        _profile31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _profile31ActionPerformed(evt);
            }
        });

        _profile32.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        _profile32.setText("PURCHASE REPORT");
        _profile32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _profile32ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout forProductLayout = new javax.swing.GroupLayout(forProduct);
        forProduct.setLayout(forProductLayout);
        forProductLayout.setHorizontalGroup(
            forProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forProductLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forProductLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(_profile31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(_profile32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 505, Short.MAX_VALUE)
                .addComponent(_profile27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_logout19)
                .addContainerGap())
        );
        forProductLayout.setVerticalGroup(
            forProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forProductLayout.createSequentialGroup()
                .addGroup(forProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forProductLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(forProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_profile27)
                    .addComponent(_logout19)
                    .addComponent(_profile31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(_profile32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        mainTopPanel.add(forProduct, "card2");

        forReport.setkEndColor(new java.awt.Color(20, 30, 48));
        forReport.setkStartColor(new java.awt.Color(36, 59, 85));

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-close-20.png"))); // NOI18N
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-subtract-20.png"))); // NOI18N

        _logout22.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        _logout22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-shutdown-22.png"))); // NOI18N
        _logout22.setText("LOGOUT");

        _profile41.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        _profile41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-customer-22.png"))); // NOI18N
        _profile41.setText("PROFILE");

        _profile43.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        _profile43.setText("PENDING REPORT");
        _profile43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _profile43ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout forReportLayout = new javax.swing.GroupLayout(forReport);
        forReport.setLayout(forReportLayout);
        forReportLayout.setHorizontalGroup(
            forReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forReportLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forReportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(_profile43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 658, Short.MAX_VALUE)
                .addComponent(_profile41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_logout22)
                .addContainerGap())
        );
        forReportLayout.setVerticalGroup(
            forReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forReportLayout.createSequentialGroup()
                .addGroup(forReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forReportLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(forReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_profile41)
                    .addComponent(_logout22)
                    .addComponent(_profile43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        mainTopPanel.add(forReport, "card2");

        forSettings.setkEndColor(new java.awt.Color(20, 30, 48));
        forSettings.setkStartColor(new java.awt.Color(36, 59, 85));

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-close-20.png"))); // NOI18N
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-subtract-20.png"))); // NOI18N

        _logout23.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        _logout23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-shutdown-22.png"))); // NOI18N
        _logout23.setText("LOGOUT");

        _profile46.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        _profile46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-customer-22.png"))); // NOI18N
        _profile46.setText("PROFILE");

        javax.swing.GroupLayout forSettingsLayout = new javax.swing.GroupLayout(forSettings);
        forSettings.setLayout(forSettingsLayout);
        forSettingsLayout.setHorizontalGroup(
            forSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forSettingsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forSettingsLayout.createSequentialGroup()
                .addContainerGap(821, Short.MAX_VALUE)
                .addComponent(_profile46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_logout23)
                .addContainerGap())
        );
        forSettingsLayout.setVerticalGroup(
            forSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forSettingsLayout.createSequentialGroup()
                .addGroup(forSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forSettingsLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(forSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_profile46)
                    .addComponent(_logout23))
                .addContainerGap())
        );

        mainTopPanel.add(forSettings, "card2");

        getContentPane().add(mainTopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 1060, 110));

        mainScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        mainScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        mainPanel.setLayout(new java.awt.CardLayout());

        _home.setBackground(new java.awt.Color(240, 248, 255));

        panelPieChart.setLayout(new java.awt.BorderLayout());

        panelBarChart.setLayout(new java.awt.BorderLayout());

        kGradientPanel2.setkEndColor(new java.awt.Color(0, 0, 70));
        kGradientPanel2.setkStartColor(new java.awt.Color(28, 181, 224));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel88.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(255, 255, 255));
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-contact-32.png"))); // NOI18N
        jLabel88.setText("ACTIVE CUSTOMER");
        kGradientPanel2.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 250, 40));

        ac.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        ac.setForeground(new java.awt.Color(255, 255, 255));
        ac.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kGradientPanel2.add(ac, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 80));

        kGradientPanel3.setkEndColor(new java.awt.Color(0, 0, 70));
        kGradientPanel3.setkStartColor(new java.awt.Color(28, 181, 224));
        kGradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel90.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(255, 255, 255));
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-report-32 (1).png"))); // NOI18N
        jLabel90.setText("PENDING REPORT");
        kGradientPanel3.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 86, 240, 30));

        jLabel91.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kGradientPanel3.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 80));

        kGradientPanel4.setkEndColor(new java.awt.Color(0, 0, 70));
        kGradientPanel4.setkStartColor(new java.awt.Color(28, 181, 224));
        kGradientPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel87.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(255, 255, 255));
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-payment-32.png"))); // NOI18N
        jLabel87.setText("DUE PAYMENT");
        kGradientPanel4.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 86, 260, 30));

        jLabel89.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(255, 255, 255));
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kGradientPanel4.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 80));

        kGradientPanel5.setkEndColor(new java.awt.Color(0, 0, 70));
        kGradientPanel5.setkStartColor(new java.awt.Color(28, 181, 224));
        kGradientPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-contact-32.png"))); // NOI18N
        jLabel85.setText("INACTIVE CUSTOMER");
        kGradientPanel5.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 86, 250, 30));

        ic.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        ic.setForeground(new java.awt.Color(255, 255, 255));
        ic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kGradientPanel5.add(ic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 260, 70));

        javax.swing.GroupLayout _homeLayout = new javax.swing.GroupLayout(_home);
        _home.setLayout(_homeLayout);
        _homeLayout.setHorizontalGroup(
            _homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_homeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(_homeLayout.createSequentialGroup()
                        .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kGradientPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(_homeLayout.createSequentialGroup()
                        .addComponent(panelPieChart, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelBarChart, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(3723, Short.MAX_VALUE))
        );
        _homeLayout.setVerticalGroup(
            _homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_homeLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kGradientPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPieChart, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBarChart, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1452, Short.MAX_VALUE))
        );

        mainPanel.add(_home, "card2");

        _area.setBackground(new java.awt.Color(240, 248, 255));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Select Area");

        arAreaName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        arAreaName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        arAreaName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arAreaNameActionPerformed(evt);
            }
        });

        assignAreaTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        assignAreaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Customer ID", "Name", "Phone", "Address", "Bandwidth", "Cost", "Active Status"
            }
        ));
        jScrollPane6.setViewportView(assignAreaTable);

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel48.setText("Sub Area");

        arSubAreaName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        arSubAreaName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        arSubAreaName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arSubAreaNameActionPerformed(evt);
            }
        });

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel81.setText("Area-wise Customer");

        javax.swing.GroupLayout _areaLayout = new javax.swing.GroupLayout(_area);
        _area.setLayout(_areaLayout);
        _areaLayout.setHorizontalGroup(
            _areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_areaLayout.createSequentialGroup()
                .addGroup(_areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(_areaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1034, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(_areaLayout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addGroup(_areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arAreaName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98)
                        .addGroup(_areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arSubAreaName, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(_areaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(3718, Short.MAX_VALUE))
        );
        _areaLayout.setVerticalGroup(
            _areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_areaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(_areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(_areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(arAreaName)
                    .addComponent(arSubAreaName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1866, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(_area, "card2");

        _addArea.setBackground(new java.awt.Color(240, 248, 255));
        _addArea.setPreferredSize(new java.awt.Dimension(1300, 700));

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/Screenshot 2022-09-25 120008.png"))); // NOI18N

        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Create New Area");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Area ID");

        _areaId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Area Name");

        _areaName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel46.setText("Sub Area");

        _subArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Connection Type");

        _conType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-add-22.png"))); // NOI18N
        jButton31.setText("Create");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(204, 0, 0));
        jButton11.setText("Reset");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(300, 613, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_areaId, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_conType, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_subArea, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_areaName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_areaId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_areaName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_subArea, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_conType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setText("Delete Area");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Area ID");

        _deleteAreaId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        _deleteArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _deleteArea.setForeground(new java.awt.Color(255, 102, 0));
        _deleteArea.setText("Delete");
        _deleteArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _deleteAreaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_deleteAreaId, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addComponent(_deleteArea, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(447, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_deleteAreaId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_deleteArea, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(189, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout _addAreaLayout = new javax.swing.GroupLayout(_addArea);
        _addArea.setLayout(_addAreaLayout);
        _addAreaLayout.setHorizontalGroup(
            _addAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, _addAreaLayout.createSequentialGroup()
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(_addAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        _addAreaLayout.setVerticalGroup(
            _addAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_addAreaLayout.createSequentialGroup()
                .addGroup(_addAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(_addAreaLayout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel58))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(_addArea, "card2");

        _packages.setBackground(new java.awt.Color(240, 248, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Our Bundles");

        packageTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        packageTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Package ID", "Package Name", "Bandwidth", "Cost", "Duration"
            }
        ));
        jScrollPane1.setViewportView(packageTable);

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-services-100.png"))); // NOI18N

        javax.swing.GroupLayout _packagesLayout = new javax.swing.GroupLayout(_packages);
        _packages.setLayout(_packagesLayout);
        _packagesLayout.setHorizontalGroup(
            _packagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_packagesLayout.createSequentialGroup()
                .addGroup(_packagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(_packagesLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1002, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(_packagesLayout.createSequentialGroup()
                        .addGap(424, 424, 424)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(_packagesLayout.createSequentialGroup()
                        .addGap(453, 453, 453)
                        .addComponent(jLabel59)))
                .addContainerGap(3737, Short.MAX_VALUE))
        );
        _packagesLayout.setVerticalGroup(
            _packagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_packagesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1554, Short.MAX_VALUE))
        );

        mainPanel.add(_packages, "card2");

        _addPackages.setBackground(new java.awt.Color(240, 248, 255));

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-packaging-40.png"))); // NOI18N
        jLabel55.setText("Create Package");

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel50.setText("Package ID");

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel51.setText("Package Name");

        packName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel52.setText("Bandwidth");

        bandWidth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel53.setText("Package Cost");

        packCost.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        packCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packCostActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel54.setText("Duration");

        packDuration.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        packDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packDurationActionPerformed(evt);
            }
        });

        _packageCreateButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _packageCreateButton.setForeground(new java.awt.Color(0, 102, 204));
        _packageCreateButton.setText("Create");
        _packageCreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _packageCreateButtonActionPerformed(evt);
            }
        });

        _packageCancelButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _packageCancelButton.setForeground(new java.awt.Color(204, 0, 0));
        _packageCancelButton.setText("Reset");
        _packageCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _packageCancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(packId, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(_packageCreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(_packageCancelButton))
                    .addComponent(packCost, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(packDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bandWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51)
                    .addComponent(packName, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(packId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(packName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bandWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(packCost, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(packDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_packageCreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_packageCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-update-40.png"))); // NOI18N
        jLabel60.setText("Update Package");

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel61.setText("Package ID");

        packBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        packBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        packBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packBoxActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel62.setText("Package Name");

        setpackNameById.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel63.setText("Bandwidth");

        setBandwidthById.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel64.setText("Package Cost");

        setPackCostById.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        setPackCostById.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPackCostByIdActionPerformed(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel65.setText("Duration");

        setDurationById.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        setDurationById.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setDurationByIdActionPerformed(evt);
            }
        });

        jButton38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton38.setForeground(new java.awt.Color(0, 102, 204));
        jButton38.setText("Update");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton44.setForeground(new java.awt.Color(204, 0, 0));
        jButton44.setText("Reset");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton44))
                    .addComponent(setPackCostById, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setDurationById, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(packBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(29, 29, 29))
                        .addComponent(jLabel60)
                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(setBandwidthById, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel62)
                        .addComponent(setpackNameById, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(packBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setpackNameById, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setBandwidthById, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setPackCostById, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setDurationById, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-delete-40.png"))); // NOI18N
        jLabel56.setText("Delete Package");

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel57.setText("Package ID");

        packBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        packBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));

        jButton43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton43.setForeground(new java.awt.Color(255, 51, 0));
        jButton43.setText("Delete");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton43)
                    .addComponent(jLabel56)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(packBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(packBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout _addPackagesLayout = new javax.swing.GroupLayout(_addPackages);
        _addPackages.setLayout(_addPackagesLayout);
        _addPackagesLayout.setHorizontalGroup(
            _addPackagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_addPackagesLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(3699, Short.MAX_VALUE))
        );
        _addPackagesLayout.setVerticalGroup(
            _addPackagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_addPackagesLayout.createSequentialGroup()
                .addGroup(_addPackagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(1423, Short.MAX_VALUE))
        );

        mainPanel.add(_addPackages, "card2");

        _customer.setBackground(new java.awt.Color(240, 248, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("New Customer");

        jButton28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton28.setForeground(new java.awt.Color(0, 102, 204));
        jButton28.setText("Submit");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton29.setForeground(new java.awt.Color(204, 0, 0));
        jButton29.setText("Reset");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Customer ID");

        _customerId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Phone");

        _customerPhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Area");

        _customerArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _customerArea.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Package ID");

        _customerPackId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _customerPackId.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        _customerPackId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _customerPackIdActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("Package Cost");

        _customerPackCost.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Customer Name");

        _customerName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Email");

        _customerEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Address");

        _customerAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Installation Date");

        _customerInstallationDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Sub Area");

        _SUBArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _SUBArea.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("Package Name");

        _customerPackName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("Bandwidth");

        _CustomerBandwidth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Connection Type");

        _customerConType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        _customerPackDuration.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setText("Package Duration");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(_customerPackName))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(_customerId, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(_customerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(_customerArea, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(_customerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(_customerEmail)
                                    .addComponent(_customerName, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(_customerPackCost, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(_customerPackId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(_SUBArea, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(_CustomerBandwidth))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(_customerConType, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(_customerPackDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(_customerInstallationDate)))))
                .addGap(67, 67, 67))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(_customerId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(_customerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(_customerName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(_customerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(_customerArea, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(_customerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(_customerPackName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(_customerPackCost, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(_SUBArea, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(_customerPackId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_customerPackDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(_customerInstallationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_CustomerBandwidth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_customerConType, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout _customerLayout = new javax.swing.GroupLayout(_customer);
        _customer.setLayout(_customerLayout);
        _customerLayout.setHorizontalGroup(
            _customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_customerLayout.createSequentialGroup()
                .addGroup(_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(_customerLayout.createSequentialGroup()
                        .addGap(414, 414, 414)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(_customerLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(_customerLayout.createSequentialGroup()
                        .addGap(402, 402, 402)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(3814, Short.MAX_VALUE))
        );
        _customerLayout.setVerticalGroup(
            _customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_customerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1493, Short.MAX_VALUE))
        );

        mainPanel.add(_customer, "card2");

        _customerProfile.setBackground(new java.awt.Color(240, 248, 255));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Search Profile");

        searchCustId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-search-22.png"))); // NOI18N
        jButton30.setText("Search");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        assignCustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Customer ID", "Name", "Phone", "Email", "Area", "Address", "Bandwidth", "Cost"
            }
        ));
        jScrollPane4.setViewportView(assignCustomerTable);

        assignCustTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Customer ID", "Name", "Phone", "Email", "Area", "Address", "Bandwidth", "Cost"
            }
        ));
        jScrollPane5.setViewportView(assignCustTable2);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("All Customer");

        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel82.setText("Individual Customer");

        javax.swing.GroupLayout _customerProfileLayout = new javax.swing.GroupLayout(_customerProfile);
        _customerProfile.setLayout(_customerProfileLayout);
        _customerProfileLayout.setHorizontalGroup(
            _customerProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_customerProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(_customerProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(_customerProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1043, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(_customerProfileLayout.createSequentialGroup()
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(938, 938, 938)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1043, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(_customerProfileLayout.createSequentialGroup()
                        .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(497, 497, 497)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton30)))
                .addContainerGap(3709, Short.MAX_VALUE))
        );
        _customerProfileLayout.setVerticalGroup(
            _customerProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_customerProfileLayout.createSequentialGroup()
                .addGroup(_customerProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(_customerProfileLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(_customerProfileLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(_customerProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchCustId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton30))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1354, Short.MAX_VALUE))
        );

        mainPanel.add(_customerProfile, "card2");

        _profileUpdate.setBackground(new java.awt.Color(240, 248, 255));

        _customer1.setBackground(new java.awt.Color(240, 248, 255));

        javax.swing.GroupLayout _customer1Layout = new javax.swing.GroupLayout(_customer1);
        _customer1.setLayout(_customer1Layout);
        _customer1Layout.setHorizontalGroup(
            _customer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4622, Short.MAX_VALUE)
        );
        _customer1Layout.setVerticalGroup(
            _customer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1079, Short.MAX_VALUE)
        );

        catchCustId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Customer ID");

        puCustId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Phone");

        puCustPhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Area");

        puAreaName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        puAreaName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Package ID");

        puPackId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        puPackId.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        puPackId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puPackIdActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel47.setText("Package Cost");

        puPackCost.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Customer Name");

        puCustName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Email");

        puCustEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Address");

        puCustAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel49.setText("Installation Date");

        puInstallationDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel66.setText("Sub Area");

        puSubAreaName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        puSubAreaName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel67.setText("Package Name");

        puPackName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel68.setText("Bandwidth");

        puBandwidth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel69.setText("Connection Type");

        puConType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        puPackDuration.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel70.setText("Package Duration");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(puPackName))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(puCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(puCustPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(puAreaName, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(puCustAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(puBandwidth))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(puConType, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(puCustEmail)
                            .addComponent(puCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(puPackCost, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(puPackId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(puSubAreaName, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(puPackDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(puInstallationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(28, 28, 28))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(puCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(puCustEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(puPackCost, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(puSubAreaName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(puPackId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(puPackDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(puInstallationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(puCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(puCustPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(puAreaName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(puCustAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(puPackName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(puBandwidth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(puConType, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jButton33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton33.setForeground(new java.awt.Color(204, 0, 0));
        jButton33.setText("Reset");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Customer ID");

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-search-22.png"))); // NOI18N
        jButton10.setText("Search");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton32.setForeground(new java.awt.Color(0, 102, 204));
        jButton32.setText("Update");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout _profileUpdateLayout = new javax.swing.GroupLayout(_profileUpdate);
        _profileUpdate.setLayout(_profileUpdateLayout);
        _profileUpdateLayout.setHorizontalGroup(
            _profileUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_profileUpdateLayout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addComponent(_customer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(_profileUpdateLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(_profileUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(_profileUpdateLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(catchCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(jButton10))
                    .addGroup(_profileUpdateLayout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        _profileUpdateLayout.setVerticalGroup(
            _profileUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_profileUpdateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(_profileUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(catchCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(_profileUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(_customer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainPanel.add(_profileUpdate, "card2");

        _connection.setBackground(new java.awt.Color(240, 248, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Assign Package To Customer");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("Package ID");

        _cPackId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _cPackId.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Customer ID");

        _cId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_cPackId, 0, 179, Short.MAX_VALUE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_cId))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_cId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_cPackId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setText("Start Date");

        _cStartDate.setDateFormatString("dd MMM, yyyy");
        _cStartDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setText("End Date");

        _cEndDate.setDateFormatString("dd MMM, yyyy");
        _cEndDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_cStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_cEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_cStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(_cEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel45.setText("Renew Update");

        buttonGroup1.add(_cAuto);
        _cAuto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _cAuto.setText("Auto");

        buttonGroup1.add(_cManual);
        _cManual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _cManual.setText("Manual");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Active Status");

        buttonGroup2.add(_cActive);
        _cActive.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _cActive.setText("Active");

        buttonGroup2.add(_cInactive);
        _cInactive.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        _cInactive.setText("Inactive");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(_cActive)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_cInactive))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(_cAuto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_cManual))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_cManual, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_cAuto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_cActive, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_cInactive, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 204, 0));
        jButton3.setText("Active");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton17.setForeground(new java.awt.Color(0, 102, 204));
        jButton17.setText("Update");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton18.setForeground(new java.awt.Color(204, 0, 0));
        jButton18.setText("Reset");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        assignPackTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Customer ID", "Package ID", "Start Date", "End Date", "Renew", "Active Status"
            }
        ));
        jScrollPane2.setViewportView(assignPackTable);

        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel83.setText("Customer Active Status");

        javax.swing.GroupLayout _connectionLayout = new javax.swing.GroupLayout(_connection);
        _connection.setLayout(_connectionLayout);
        _connectionLayout.setHorizontalGroup(
            _connectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_connectionLayout.createSequentialGroup()
                .addGroup(_connectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(_connectionLayout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(_connectionLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(_connectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1021, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, _connectionLayout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112)
                                .addGroup(_connectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel83, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(3720, Short.MAX_VALUE))
        );
        _connectionLayout.setVerticalGroup(
            _connectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_connectionLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(_connectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(_connectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26)
                .addGroup(_connectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1445, Short.MAX_VALUE))
        );

        mainPanel.add(_connection, "card2");

        _payment.setBackground(new java.awt.Color(240, 248, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-invoice-64.png"))); // NOI18N
        jLabel6.setText("Invoice");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/communication.png"))); // NOI18N

        jLabel41.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 102, 153));
        jLabel41.setText("FLASHNET");

        jLabel71.setForeground(new java.awt.Color(0, 153, 102));
        jLabel71.setText("INTERNET SERVICE PROVIDER");

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel72.setText("Billed To :");

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel79.setText("Collector :");

        payName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        payBand.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel73.setText("019xxxxxxxx0");

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel74.setText("Flashnet ISP");

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel75.setText("Street-12, Block-D, Basundhora Res.");

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel76.setText("admin.flasnet@gmail.com");

        payTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Customer ID", "Start Date", "End Date"
            }
        ));
        jScrollPane3.setViewportView(payTable);

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel77.setText("Payment Cash :");

        jLabel78.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel78.setText("Payment Due :");

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel80.setText("Total :");

        cash.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        due.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        total.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-refresh-22.png"))); // NOI18N
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 558, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(34, 34, 34))
                            .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(payName, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(payBand, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(145, 145, 145)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel75)
                            .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3)
                            .addComponent(jLabel71))
                        .addGap(28, 28, 28))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel77, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel78, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cash)
                    .addComponent(due)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel71)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(payName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(payBand, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cash, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(due, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jButton34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-print-30.png"))); // NOI18N
        jButton34.setText("Print");

        queryBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryBoxActionPerformed(evt);
            }
        });

        queryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-add-22.png"))); // NOI18N
        queryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout _paymentLayout = new javax.swing.GroupLayout(_payment);
        _payment.setLayout(_paymentLayout);
        _paymentLayout.setHorizontalGroup(
            _paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_paymentLayout.createSequentialGroup()
                .addGroup(_paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(_paymentLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(queryBox, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(queryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(589, 589, 589)
                        .addComponent(jButton34))
                    .addGroup(_paymentLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(3810, Short.MAX_VALUE))
        );
        _paymentLayout.setVerticalGroup(
            _paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_paymentLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(_paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(queryButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(queryBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1450, Short.MAX_VALUE))
        );

        mainPanel.add(_payment, "card2");

        _paymentHistory.setBackground(new java.awt.Color(240, 248, 255));

        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pay_cust_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pay_cust_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pay_cust_idActionPerformed(evt);
            }
        });
        jPanel12.add(pay_cust_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 120, 30));

        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/Flashnet/Icon/icons8-search-22.png"))); // NOI18N
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 50, -1));

        jLabel84.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setText("Customer ID");
        jPanel12.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 120, 29));

        pay_paid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pay_paid.setForeground(new java.awt.Color(0, 204, 51));
        pay_paid.setText("Paid");
        jPanel12.add(pay_paid, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 74, 31));

        jButton37.setForeground(new java.awt.Color(0, 0, 102));
        jButton37.setText("Done!");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 80, 30));

        Ptable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Customer ID", "Package ID", "Start Date", "End Date", "Renew", "Active Status", "Payment"
            }
        ));
        jScrollPane7.setViewportView(Ptable1);

        Ptable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Customer ID", "Package ID", "Start Date", "End Date", "Renew", "Active Status", "Payment"
            }
        ));
        jScrollPane8.setViewportView(Ptable2);

        jLabel86.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel86.setText("History");

        javax.swing.GroupLayout _paymentHistoryLayout = new javax.swing.GroupLayout(_paymentHistory);
        _paymentHistory.setLayout(_paymentHistoryLayout);
        _paymentHistoryLayout.setHorizontalGroup(
            _paymentHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_paymentHistoryLayout.createSequentialGroup()
                .addGroup(_paymentHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(_paymentHistoryLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(_paymentHistoryLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(_paymentHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 1007, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(3734, Short.MAX_VALUE))
        );
        _paymentHistoryLayout.setVerticalGroup(
            _paymentHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_paymentHistoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1461, Short.MAX_VALUE))
        );

        mainPanel.add(_paymentHistory, "card2");

        _product.setBackground(new java.awt.Color(240, 248, 255));

        javax.swing.GroupLayout _productLayout = new javax.swing.GroupLayout(_product);
        _product.setLayout(_productLayout);
        _productLayout.setHorizontalGroup(
            _productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4764, Short.MAX_VALUE)
        );
        _productLayout.setVerticalGroup(
            _productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2025, Short.MAX_VALUE)
        );

        mainPanel.add(_product, "card2");

        _saleReport.setBackground(new java.awt.Color(240, 248, 255));

        javax.swing.GroupLayout _saleReportLayout = new javax.swing.GroupLayout(_saleReport);
        _saleReport.setLayout(_saleReportLayout);
        _saleReportLayout.setHorizontalGroup(
            _saleReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4764, Short.MAX_VALUE)
        );
        _saleReportLayout.setVerticalGroup(
            _saleReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2025, Short.MAX_VALUE)
        );

        mainPanel.add(_saleReport, "card2");

        _purchaseReport.setBackground(new java.awt.Color(240, 248, 255));

        javax.swing.GroupLayout _purchaseReportLayout = new javax.swing.GroupLayout(_purchaseReport);
        _purchaseReport.setLayout(_purchaseReportLayout);
        _purchaseReportLayout.setHorizontalGroup(
            _purchaseReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4764, Short.MAX_VALUE)
        );
        _purchaseReportLayout.setVerticalGroup(
            _purchaseReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2025, Short.MAX_VALUE)
        );

        mainPanel.add(_purchaseReport, "card2");

        _report.setBackground(new java.awt.Color(240, 248, 255));

        javax.swing.GroupLayout _reportLayout = new javax.swing.GroupLayout(_report);
        _report.setLayout(_reportLayout);
        _reportLayout.setHorizontalGroup(
            _reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4764, Short.MAX_VALUE)
        );
        _reportLayout.setVerticalGroup(
            _reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2025, Short.MAX_VALUE)
        );

        mainPanel.add(_report, "card2");

        _pendingReport.setBackground(new java.awt.Color(240, 248, 255));

        javax.swing.GroupLayout _pendingReportLayout = new javax.swing.GroupLayout(_pendingReport);
        _pendingReport.setLayout(_pendingReportLayout);
        _pendingReportLayout.setHorizontalGroup(
            _pendingReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4764, Short.MAX_VALUE)
        );
        _pendingReportLayout.setVerticalGroup(
            _pendingReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2025, Short.MAX_VALUE)
        );

        mainPanel.add(_pendingReport, "card2");

        _settings.setBackground(new java.awt.Color(240, 248, 255));

        javax.swing.GroupLayout _settingsLayout = new javax.swing.GroupLayout(_settings);
        _settings.setLayout(_settingsLayout);
        _settingsLayout.setHorizontalGroup(
            _settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4764, Short.MAX_VALUE)
        );
        _settingsLayout.setVerticalGroup(
            _settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2025, Short.MAX_VALUE)
        );

        mainPanel.add(_settings, "card2");

        javax.swing.GroupLayout _profileLayout = new javax.swing.GroupLayout(_profile);
        _profile.setLayout(_profileLayout);
        _profileLayout.setHorizontalGroup(
            _profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4764, Short.MAX_VALUE)
        );
        _profileLayout.setVerticalGroup(
            _profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2025, Short.MAX_VALUE)
        );

        mainPanel.add(_profile, "card21");

        mainScrollPane1.setViewportView(mainPanel);

        getContentPane().add(mainScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 1060, 590));

        setSize(new java.awt.Dimension(1300, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    void addToPackageList(){
        String sql = "SELECT * FROM packages";
        Connection con = DBC.getDB();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                String pkId = rs.getString("pack_id");
                String pkName = rs.getString("pack_name");
                String bWidth = rs.getString("bandwidth");
                double pkCost = rs.getDouble("pack_cost");
                int pkDuration = rs.getInt("pack_duration");
                
                Object[] rowData = {pkId, pkName, bWidth, pkCost, pkDuration};
                packageModel.addRow(rowData);
            }
            packageTable.setModel(packageModel);
        } catch (Exception e) {
        } finally {
            try {
                con.close();
            } catch (Exception e) {
            }
        }
    }
    
    void addToConnectionList(){
        String sql = "SELECT * FROM connection";
        Connection con = DBC.getDB();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                String cusId = rs.getString("cust_id");
                String cusPackId = rs.getString("pack_id");
                String cusStartDate = rs.getString("start_date");
                String cusEndDate = rs.getString("end_date");
                String cusRenewType = rs.getString("renew_type");
                String cusActiveStatus = rs.getString("active_status");
                
                Object[] rowData = {cusId, cusPackId, cusStartDate, cusEndDate, cusRenewType, cusActiveStatus};
                connectionModel.addRow(rowData);
            }
            assignPackTable.setModel(connectionModel);
        } catch (Exception e) {
        } finally {
            try {
                con.close();
            } catch (Exception e) {
            }
        }
    }
    
    void addToAreaList(){
        String sql = "SELECT * FROM customer WHERE area_name = ?";
        Connection con = DBC.getDB();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, arAreaName.getSelectedItem().toString());
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                String cuId = rs.getString("cust_id");
                String cuName = rs.getString("cust_name");
                String cuPhone = rs.getString("cust_phone");
                String cuAddress = rs.getString("cust_address");
                String cuBandwidth = rs.getString("bandwidth");
                String cuPackCost = rs.getString("pack_cost");
                String cuActiveStatus = rs.getString("active_status");
                
                Object[] rowData = {cuId, cuName, cuPhone, cuAddress, cuBandwidth, cuPackCost, cuActiveStatus};
                areaModel.addRow(rowData);
            }
            assignAreaTable.setModel(areaModel);
        } catch (Exception e) {
        } finally {
            try {
                con.close();
            } catch (Exception e) {
            }
        }
    }
    
    void addToAreaList2(){
        String sql = "SELECT * FROM customer";
        Connection con = DBC.getDB();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                String cuId = rs.getString("cust_id");
                String cuName = rs.getString("cust_name");
                String cuPhone = rs.getString("cust_phone");
                String cuAddress = rs.getString("cust_address");
                String cuBandwidth = rs.getString("bandwidth");
                String cuPackCost = rs.getString("pack_cost");
                String cuActiveStatus = rs.getString("active_status");
                
                Object[] rowData = {cuId, cuName, cuPhone, cuAddress, cuBandwidth, cuPackCost, cuActiveStatus};
                areaModel2.addRow(rowData);
            }
            assignAreaTable.setModel(areaModel2);
        } catch (Exception e) {
        } finally {
            try {
                con.close();
            } catch (Exception e) {
            }
        }
    }
    
    void addToSubAreaList(){
        String sql = "SELECT * FROM customer WHERE sub_area = ?";
        Connection con = DBC.getDB();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, arSubAreaName.getSelectedItem().toString());
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                String cuId = rs.getString("cust_id");
                String cuName = rs.getString("cust_name");
                String cuPhone = rs.getString("cust_phone");
                String cuAddress = rs.getString("cust_address");
                String cuBandwidth = rs.getString("bandwidth");
                String cuPackCost = rs.getString("pack_cost");
                String cuActiveStatus = rs.getString("active_status");
                
                Object[] rowData = {cuId, cuName, cuPhone, cuAddress, cuBandwidth, cuPackCost, cuActiveStatus};
                subAreaModel.addRow(rowData);
            }
            assignAreaTable.setModel(subAreaModel);
        } catch (Exception e) {
        } finally {
            try {
                con.close();
            } catch (Exception e) {
            }
        }
    }
    
    void addToCustomerList(){
        String sql = "SELECT * FROM customer WHERE cust_id = ?";
        Connection con = DBC.getDB();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, searchCustId.getText());
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                String _cuId = rs.getString("cust_id");
                String _cuName = rs.getString("cust_name");
                String _cuPhone = rs.getString("cust_phone");
                String _cuEmail = rs.getString("cust_email");
                String _cuAreaName = rs.getString("area_name");
                String _cuAddress = rs.getString("cust_address");
                String _cuBandwidth = rs.getString("bandwidth");
                String _cuPackCost = rs.getString("pack_cost");
                
                Object[] rowData = {_cuId, _cuName, _cuPhone, _cuEmail, _cuAreaName, _cuAddress, _cuBandwidth, _cuPackCost};
                customerModel.addRow(rowData);
            }
            assignCustomerTable.setModel(customerModel);
        } catch (Exception e) {
        } finally {
            try {
                con.close();
            } catch (Exception e) {
            }
        }
    }
    
    void addToCustomerList2(){
        String sql = "SELECT * FROM customer";
        Connection con = DBC.getDB();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                String _cuId = rs.getString("cust_id");
                String _cuName = rs.getString("cust_name");
                String _cuPhone = rs.getString("cust_phone");
                String _cuEmail = rs.getString("cust_email");
                String _cuAreaName = rs.getString("area_name");
                String _cuAddress = rs.getString("cust_address");
                String _cuBandwidth = rs.getString("bandwidth");
                String _cuPackCost = rs.getString("pack_cost");
                
                Object[] rowData = {_cuId, _cuName, _cuPhone, _cuEmail, _cuAreaName, _cuAddress, _cuBandwidth, _cuPackCost};
                customerModel2.addRow(rowData);
            }
            assignCustTable2.setModel(customerModel2);
        } catch (Exception e) {
        } finally {
            try {
                con.close();
            } catch (Exception e) {
            }
        }
    }
    
    private void _customerInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__customerInfoButtonActionPerformed
        resetCreateCustomer();
        
        forHome.setVisible(false);
        forArea.setVisible(false);
        forPackages.setVisible(false);
        forCustomer.setVisible(true);
        forConnection.setVisible(false);
        forPayment.setVisible(false);
        forProduct.setVisible(false);
        forReport.setVisible(false);
        forSettings.setVisible(false);
        _home.setVisible(false);
        _area.setVisible(false);
        _addArea.setVisible(false);
        _packages.setVisible(false);
        _addPackages.setVisible(false);
        _customer.setVisible(true);
        _customerProfile.setVisible(false);
        _profileUpdate.setVisible(false);
        _connection.setVisible(false);
        _payment.setVisible(false);
        _paymentHistory.setVisible(false);
        _product.setVisible(false);
        _saleReport.setVisible(false);
        _purchaseReport.setVisible(false);
        _report.setVisible(false);
        _pendingReport.setVisible(false);
        _settings.setVisible(false);
        _profile.setVisible(false);
    }//GEN-LAST:event__customerInfoButtonActionPerformed

    private void _packagesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__packagesButtonActionPerformed
        packageModel = new DefaultTableModel();
        packageModel.addColumn("Package ID");
        packageModel.addColumn("Package Name");
        packageModel.addColumn("Bandwidth");
        packageModel.addColumn("Cost");
        packageModel.addColumn("Duration");
        addToPackageList();
        
        forHome.setVisible(false);
        forArea.setVisible(false);
        forPackages.setVisible(true);
        forCustomer.setVisible(false);
        forConnection.setVisible(false);
        forPayment.setVisible(false);
        forProduct.setVisible(false);
        forReport.setVisible(false);
        forSettings.setVisible(false);
        _home.setVisible(false);
        _area.setVisible(false);
        _addArea.setVisible(false);
        _packages.setVisible(true);
        _addPackages.setVisible(false);
        _customer.setVisible(false);
        _customerProfile.setVisible(false);
        _profileUpdate.setVisible(false);
        _connection.setVisible(false);
        _payment.setVisible(false);
        _paymentHistory.setVisible(false);
        _product.setVisible(false);
        _saleReport.setVisible(false);
        _purchaseReport.setVisible(false);
        _report.setVisible(false);
        _pendingReport.setVisible(false);
        _settings.setVisible(false);
        _profile.setVisible(false);
    }//GEN-LAST:event__packagesButtonActionPerformed

    private void _dashboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__dashboardButtonActionPerformed
        forHome.setVisible(true);
        forArea.setVisible(false);
        forPackages.setVisible(false);
        forCustomer.setVisible(false);
        forConnection.setVisible(false);
        forPayment.setVisible(false);
        forProduct.setVisible(false);
        forReport.setVisible(false);
        forSettings.setVisible(false);
        _home.setVisible(true);
        _area.setVisible(false);
        _addArea.setVisible(false);
        _packages.setVisible(false);
        _addPackages.setVisible(false);
        _customer.setVisible(false);
        _customerProfile.setVisible(false);
        _profileUpdate.setVisible(false);
        _connection.setVisible(false);
        _payment.setVisible(false);
        _paymentHistory.setVisible(false);
        _product.setVisible(false);
        _saleReport.setVisible(false);
        _purchaseReport.setVisible(false);
        _report.setVisible(false);
        _pendingReport.setVisible(false);
        _settings.setVisible(false);
        _profile.setVisible(false);
        
        showPieChart();
        showBarChart();
    }//GEN-LAST:event__dashboardButtonActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        forHome.setVisible(false);
        forArea.setVisible(false);
        forPackages.setVisible(false);
        forCustomer.setVisible(false);
        forConnection.setVisible(false);
        forPayment.setVisible(true);
        forProduct.setVisible(false);
        forReport.setVisible(false);
        forSettings.setVisible(false);
        _home.setVisible(false);
        _area.setVisible(false);
        _addArea.setVisible(false);
        _packages.setVisible(false);
        _addPackages.setVisible(false);
        _customer.setVisible(false);
        _customerProfile.setVisible(false);
        _profileUpdate.setVisible(false);
        _connection.setVisible(false);
        _payment.setVisible(true);
        _paymentHistory.setVisible(false);
        _product.setVisible(false);
        _saleReport.setVisible(false);
        _purchaseReport.setVisible(false);
        _report.setVisible(false);
        _pendingReport.setVisible(false);
        _settings.setVisible(false);
        _profile.setVisible(false);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        forHome.setVisible(false);
        forArea.setVisible(false);
        forPackages.setVisible(false);
        forCustomer.setVisible(false);
        forConnection.setVisible(false);
        forPayment.setVisible(false);
        forProduct.setVisible(true);
        forReport.setVisible(false);
        forSettings.setVisible(false);
        _home.setVisible(false);
        _area.setVisible(false);
        _addArea.setVisible(false);
        _packages.setVisible(false);
        _addPackages.setVisible(false);
        _customer.setVisible(false);
        _customerProfile.setVisible(false);
        _profileUpdate.setVisible(false);
        _connection.setVisible(false);
        _payment.setVisible(false);
        _paymentHistory.setVisible(false);
        _product.setVisible(true);
        _saleReport.setVisible(false);
        _purchaseReport.setVisible(false);
        _report.setVisible(false);
        _pendingReport.setVisible(false);
        _settings.setVisible(false);
        _profile.setVisible(false);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void _areaCoverageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__areaCoverageButtonActionPerformed
        resetAr();
        
        areaModel2 = new DefaultTableModel();
        areaModel2.addColumn("Customer ID");
        areaModel2.addColumn("Name");
        areaModel2.addColumn("Phone");
        areaModel2.addColumn("Address");
        areaModel2.addColumn("Bandwidth");
        areaModel2.addColumn("Cost");
        areaModel2.addColumn("Active Status");
        addToAreaList2();
        
        forHome.setVisible(false);
        forArea.setVisible(true);
        forPackages.setVisible(false);
        forCustomer.setVisible(false);
        forConnection.setVisible(false);
        forPayment.setVisible(false);
        forProduct.setVisible(false);
        forReport.setVisible(false);
        forSettings.setVisible(false);
        _home.setVisible(false);
        _area.setVisible(true);
        _addArea.setVisible(false);
        _packages.setVisible(false);
        _addPackages.setVisible(false);
        _customer.setVisible(false);
        _customerProfile.setVisible(false);
        _profileUpdate.setVisible(false);
        _connection.setVisible(false);
        _payment.setVisible(false);
        _paymentHistory.setVisible(false);
        _product.setVisible(false);
        _saleReport.setVisible(false);
        _purchaseReport.setVisible(false);
        _report.setVisible(false);
        _pendingReport.setVisible(false);
        _settings.setVisible(false);
        _profile.setVisible(false);
    }//GEN-LAST:event__areaCoverageButtonActionPerformed

    private void _connectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__connectionButtonActionPerformed
        connectionModel = new DefaultTableModel();
        connectionModel.addColumn("Customer ID");
        connectionModel.addColumn("Package ID");
        connectionModel.addColumn("Start date");
        connectionModel.addColumn("End date");
        connectionModel.addColumn("Renew");
        connectionModel.addColumn("Active Status");
        addToConnectionList();
        resetConnection();

        forHome.setVisible(false);
        forArea.setVisible(false);
        forPackages.setVisible(false);
        forCustomer.setVisible(false);
        forConnection.setVisible(true);
        forPayment.setVisible(false);
        forProduct.setVisible(false);
        forReport.setVisible(false);
        forSettings.setVisible(false);
        _home.setVisible(false);
        _area.setVisible(false);
        _addArea.setVisible(false);
        _packages.setVisible(false);
        _addPackages.setVisible(false);
        _customer.setVisible(false);
        _customerProfile.setVisible(false);
        _profileUpdate.setVisible(false);
        _connection.setVisible(true);
        _payment.setVisible(false);
        _paymentHistory.setVisible(false);
        _product.setVisible(false);
        _saleReport.setVisible(false);
        _purchaseReport.setVisible(false);
        _report.setVisible(false);
        _pendingReport.setVisible(false);
        _settings.setVisible(false);
        _profile.setVisible(false);
    }//GEN-LAST:event__connectionButtonActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        forHome.setVisible(false);
        forArea.setVisible(false);
        forPackages.setVisible(false);
        forCustomer.setVisible(false);
        forConnection.setVisible(false);
        forPayment.setVisible(false);
        forProduct.setVisible(false);
        forReport.setVisible(true);
        forSettings.setVisible(false);
        _home.setVisible(false);
        _area.setVisible(false);
        _addArea.setVisible(false);
        _packages.setVisible(false);
        _addPackages.setVisible(false);
        _customer.setVisible(false);
        _customerProfile.setVisible(false);
        _profileUpdate.setVisible(false);
        _connection.setVisible(false);
        _payment.setVisible(false);
        _paymentHistory.setVisible(false);
        _product.setVisible(false);
        _saleReport.setVisible(false);
        _purchaseReport.setVisible(false);
        _report.setVisible(true);
        _pendingReport.setVisible(false);
        _settings.setVisible(false);
        _profile.setVisible(false);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        forHome.setVisible(false);
        forArea.setVisible(false);
        forPackages.setVisible(false);
        forCustomer.setVisible(false);
        forConnection.setVisible(false);
        forPayment.setVisible(false);
        forProduct.setVisible(false);
        forReport.setVisible(false);
        forSettings.setVisible(true);
        _home.setVisible(false);
        _area.setVisible(false);
        _addArea.setVisible(false);
        _packages.setVisible(false);
        _addPackages.setVisible(false);
        _customer.setVisible(false);
        _customerProfile.setVisible(false);
        _profileUpdate.setVisible(false);
        _connection.setVisible(false);
        _payment.setVisible(false);
        _paymentHistory.setVisible(false);
        _product.setVisible(false);
        _saleReport.setVisible(false);
        _purchaseReport.setVisible(false);
        _report.setVisible(false);
        _pendingReport.setVisible(false);
        _settings.setVisible(true);
        _profile.setVisible(false);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void _profile21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__profile21ActionPerformed
        resetProfileUpdateData();
        
        forHome.setVisible(false);
        forArea.setVisible(false);
        forPackages.setVisible(false);
        forCustomer.setVisible(true);
        forConnection.setVisible(false);
        forPayment.setVisible(false);
        forProduct.setVisible(false);
        forReport.setVisible(false);
        forSettings.setVisible(false);
        _home.setVisible(false);
        _area.setVisible(false);
        _addArea.setVisible(false);
        _packages.setVisible(false);
        _addPackages.setVisible(false);
        _customer.setVisible(false);
        _customerProfile.setVisible(false);
        _profileUpdate.setVisible(true);
        _connection.setVisible(false);
        _payment.setVisible(false);
        _paymentHistory.setVisible(false);
        _product.setVisible(false);
        _saleReport.setVisible(false);
        _purchaseReport.setVisible(false);
        _report.setVisible(false);
        _pendingReport.setVisible(false);
        _settings.setVisible(false);
        _profile.setVisible(false);
    }//GEN-LAST:event__profile21ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void _profile31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__profile31ActionPerformed
        forHome.setVisible(false);
        forArea.setVisible(false);
        forPackages.setVisible(false);
        forCustomer.setVisible(false);
        forConnection.setVisible(false);
        forPayment.setVisible(false);
        forProduct.setVisible(true);
        forReport.setVisible(false);
        forSettings.setVisible(false);
        _home.setVisible(false);
        _area.setVisible(false);
        _addArea.setVisible(false);
        _packages.setVisible(false);
        _addPackages.setVisible(false);
        _customer.setVisible(false);
        _customerProfile.setVisible(false);
        _profileUpdate.setVisible(false);
        _connection.setVisible(false);
        _payment.setVisible(false);
        _paymentHistory.setVisible(false);
        _product.setVisible(false);
        _saleReport.setVisible(true);
        _purchaseReport.setVisible(false);
        _report.setVisible(false);
        _pendingReport.setVisible(false);
        _settings.setVisible(false);
        _profile.setVisible(false);
    }//GEN-LAST:event__profile31ActionPerformed

    private void _profile32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__profile32ActionPerformed
        forHome.setVisible(false);
        forArea.setVisible(false);
        forPackages.setVisible(false);
        forCustomer.setVisible(false);
        forConnection.setVisible(false);
        forPayment.setVisible(false);
        forProduct.setVisible(true);
        forReport.setVisible(false);
        forSettings.setVisible(false);
        _home.setVisible(false);
        _area.setVisible(false);
        _addArea.setVisible(false);
        _packages.setVisible(false);
        _addPackages.setVisible(false);
        _customer.setVisible(false);
        _customerProfile.setVisible(false);
        _profileUpdate.setVisible(false);
        _connection.setVisible(false);
        _payment.setVisible(false);
        _paymentHistory.setVisible(false);
        _product.setVisible(false);
        _saleReport.setVisible(false);
        _purchaseReport.setVisible(true);
        _report.setVisible(false);
        _pendingReport.setVisible(false);
        _settings.setVisible(false);
        _profile.setVisible(false);
    }//GEN-LAST:event__profile32ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void _profile19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__profile19ActionPerformed
        customerModel2 = new DefaultTableModel();
        customerModel2.addColumn("Customer ID");
        customerModel2.addColumn("Name");
        customerModel2.addColumn("Phone");
        customerModel2.addColumn("Email");
        customerModel2.addColumn("Area");
        customerModel2.addColumn("Address");
        customerModel2.addColumn("Bandwidth");
        customerModel2.addColumn("Cost");
        addToCustomerList2();
        
        forHome.setVisible(false);
        forArea.setVisible(false);
        forPackages.setVisible(false);
        forCustomer.setVisible(true);
        forConnection.setVisible(false);
        forPayment.setVisible(false);
        forProduct.setVisible(false);
        forReport.setVisible(false);
        forSettings.setVisible(false);
        _home.setVisible(false);
        _area.setVisible(false);
        _addArea.setVisible(false);
        _packages.setVisible(false);
        _addPackages.setVisible(false);
        _customer.setVisible(false);
        _customerProfile.setVisible(true);
        _profileUpdate.setVisible(false);
        _connection.setVisible(false);
        _payment.setVisible(false);
        _paymentHistory.setVisible(false);
        _product.setVisible(false);
        _saleReport.setVisible(false);
        _purchaseReport.setVisible(false);
        _report.setVisible(false);
        _pendingReport.setVisible(false);
        _settings.setVisible(false);
        _profile.setVisible(false);
    }//GEN-LAST:event__profile19ActionPerformed

    private void _profile24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__profile24ActionPerformed
        viewPaymentHistory();
        
        forHome.setVisible(false);
        forArea.setVisible(false);
        forPackages.setVisible(false);
        forCustomer.setVisible(false);
        forConnection.setVisible(false);
        forPayment.setVisible(true);
        forProduct.setVisible(false);
        forReport.setVisible(false);
        forSettings.setVisible(false);
        _home.setVisible(false);
        _area.setVisible(false);
        _addArea.setVisible(false);
        _packages.setVisible(false);
        _addPackages.setVisible(false);
        _customer.setVisible(false);
        _customerProfile.setVisible(false);
        _profileUpdate.setVisible(false);
        _connection.setVisible(false);
        _payment.setVisible(false);
        _paymentHistory.setVisible(true);
        _product.setVisible(false);
        _saleReport.setVisible(false);
        _purchaseReport.setVisible(false);
        _report.setVisible(false);
        _pendingReport.setVisible(false);
        _settings.setVisible(false);
        _profile.setVisible(false);
    }//GEN-LAST:event__profile24ActionPerformed

    private void _profile26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__profile26ActionPerformed
        forHome.setVisible(false);
        forArea.setVisible(true);
        forPackages.setVisible(false);
        forCustomer.setVisible(false);
        forConnection.setVisible(false);
        forPayment.setVisible(false);
        forProduct.setVisible(false);
        forReport.setVisible(false);
        forSettings.setVisible(false);
        _home.setVisible(false);
        _area.setVisible(false);
        _addArea.setVisible(true);
        _packages.setVisible(false);
        _addPackages.setVisible(false);
        _customer.setVisible(false);
        _customerProfile.setVisible(false);
        _profileUpdate.setVisible(false);
        _connection.setVisible(false);
        _payment.setVisible(false);
        _paymentHistory.setVisible(false);
        _product.setVisible(false);
        _saleReport.setVisible(false);
        _purchaseReport.setVisible(false);
        _report.setVisible(false);
        _pendingReport.setVisible(false);
        _settings.setVisible(false);
        _profile.setVisible(false);
    }//GEN-LAST:event__profile26ActionPerformed

    private void _profile43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__profile43ActionPerformed
        forHome.setVisible(false);
        forArea.setVisible(false);
        forPackages.setVisible(false);
        forCustomer.setVisible(false);
        forConnection.setVisible(false);
        forPayment.setVisible(false);
        forProduct.setVisible(false);
        forReport.setVisible(true);
        forSettings.setVisible(false);
        _home.setVisible(false);
        _area.setVisible(false);
        _addArea.setVisible(false);
        _packages.setVisible(false);
        _addPackages.setVisible(false);
        _customer.setVisible(false);
        _customerProfile.setVisible(false);
        _profileUpdate.setVisible(false);
        _connection.setVisible(false);
        _payment.setVisible(false);
        _paymentHistory.setVisible(false);
        _product.setVisible(false);
        _saleReport.setVisible(false);
        _purchaseReport.setVisible(false);
        _report.setVisible(false);
        _pendingReport.setVisible(true);
        _settings.setVisible(false);
        _profile.setVisible(false);
    }//GEN-LAST:event__profile43ActionPerformed

    private void _operationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__operationsButtonActionPerformed
        forHome.setVisible(false);
        forArea.setVisible(false);
        forPackages.setVisible(true);
        forCustomer.setVisible(false);
        forConnection.setVisible(false);
        forPayment.setVisible(false);
        forProduct.setVisible(false);
        forReport.setVisible(false);
        forSettings.setVisible(false);
        _home.setVisible(false);
        _area.setVisible(false);
        _addArea.setVisible(false);
        _packages.setVisible(false);
        _addPackages.setVisible(true);
        _customer.setVisible(false);
        _customerProfile.setVisible(false);
        _profileUpdate.setVisible(false);
        _connection.setVisible(false);
        _payment.setVisible(false);
        _paymentHistory.setVisible(false);
        _product.setVisible(false);
        _saleReport.setVisible(false);
        _purchaseReport.setVisible(false);
        _report.setVisible(false);
        _pendingReport.setVisible(false);
        _settings.setVisible(false);
        _profile.setVisible(false);
        resetUpdatePackages();
    }//GEN-LAST:event__operationsButtonActionPerformed

    private void packCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_packCostActionPerformed

    private void packDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packDurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_packDurationActionPerformed

    private void setPackCostByIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPackCostByIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setPackCostByIdActionPerformed

    private void setDurationByIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setDurationByIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setDurationByIdActionPerformed

    private void _packageCreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__packageCreateButtonActionPerformed
        createPackages();
    }//GEN-LAST:event__packageCreateButtonActionPerformed

    private void _packageCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__packageCancelButtonActionPerformed
        resetPackages();
    }//GEN-LAST:event__packageCancelButtonActionPerformed

    private void packBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packBoxActionPerformed
        viewPackages();
    }//GEN-LAST:event_packBoxActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        new PackagesDAO().delete(packBox2.getSelectedItem().toString());
        loadPackBox();
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        resetUpdatePackages();
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        updatePackages();
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        resetArea();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        saveArea();
        resetArea();
    }//GEN-LAST:event_jButton31ActionPerformed

    private void _deleteAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__deleteAreaActionPerformed
        new AreaDAO().delete(_deleteAreaId.getText());
        _deleteAreaId.setText("");
    }//GEN-LAST:event__deleteAreaActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        createCustomer();
        saveCustomer();
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        resetCreateCustomer();
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        saveConnection();
        updateConnection();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        updateCon1();
        updateCon2();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        resetConnection();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void _customerPackIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__customerPackIdActionPerformed
        viewPackOnCreateCustomer();
    }//GEN-LAST:event__customerPackIdActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        updateCustomerProfile();
        resetProfileUpdateData();
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        resetProfileUpdateData();
    }//GEN-LAST:event_jButton33ActionPerformed

    private void puPackIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puPackIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_puPackIdActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        viewUpdatePackData();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void arAreaNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arAreaNameActionPerformed
        areaModel = new DefaultTableModel();
        areaModel.addColumn("Customer ID");
        areaModel.addColumn("Name");
        areaModel.addColumn("Phone");
        areaModel.addColumn("Address");
        areaModel.addColumn("Bandwidth");
        areaModel.addColumn("Cost");
        areaModel.addColumn("Active Status");
        addToAreaList();
        
    }//GEN-LAST:event_arAreaNameActionPerformed

    private void arSubAreaNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arSubAreaNameActionPerformed
        subAreaModel = new DefaultTableModel();
        subAreaModel.addColumn("Customer ID");
        subAreaModel.addColumn("Name");
        subAreaModel.addColumn("Phone");
        subAreaModel.addColumn("Address");
        subAreaModel.addColumn("Bandwidth");
        subAreaModel.addColumn("Cost");
        subAreaModel.addColumn("Active Status");
        addToSubAreaList();
        
        //resetSubAreaList();
    }//GEN-LAST:event_arSubAreaNameActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        customerModel = new DefaultTableModel();
        customerModel.addColumn("Customer ID");
        customerModel.addColumn("Name");
        customerModel.addColumn("Phone");
        customerModel.addColumn("Email");
        customerModel.addColumn("Area");
        customerModel.addColumn("Address");
        customerModel.addColumn("Bandwidth");
        customerModel.addColumn("Cost");
        addToCustomerList();
    }//GEN-LAST:event_jButton30ActionPerformed

    private void queryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryButtonActionPerformed
        viewInvoice();
    }//GEN-LAST:event_queryButtonActionPerformed

    private void queryBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_queryBoxActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        total.setText(String.valueOf(total()));
    }//GEN-LAST:event_jButton35ActionPerformed

    private void pay_cust_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pay_cust_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pay_cust_idActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        viewPayment2();
        //savePayment();
        viewPaymentHistory();
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        viewPayment1();
    }//GEN-LAST:event_jButton36ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Ptable1;
    private javax.swing.JTable Ptable2;
    private javax.swing.JTextField _CustomerBandwidth;
    private javax.swing.JComboBox _SUBArea;
    private javax.swing.JPanel _addArea;
    private javax.swing.JPanel _addPackages;
    private javax.swing.JPanel _area;
    private javax.swing.JButton _areaCoverageButton;
    private javax.swing.JTextField _areaId;
    private javax.swing.JTextField _areaName;
    private javax.swing.JCheckBox _cActive;
    private javax.swing.JCheckBox _cAuto;
    private com.toedter.calendar.JDateChooser _cEndDate;
    private javax.swing.JTextField _cId;
    private javax.swing.JCheckBox _cInactive;
    private javax.swing.JCheckBox _cManual;
    private javax.swing.JComboBox _cPackId;
    private com.toedter.calendar.JDateChooser _cStartDate;
    private javax.swing.JTextField _conType;
    private javax.swing.JPanel _connection;
    private javax.swing.JButton _connectionButton;
    private javax.swing.JPanel _customer;
    private javax.swing.JPanel _customer1;
    private javax.swing.JTextField _customerAddress;
    private javax.swing.JComboBox _customerArea;
    private javax.swing.JTextField _customerConType;
    private javax.swing.JTextField _customerEmail;
    private javax.swing.JTextField _customerId;
    private javax.swing.JButton _customerInfoButton;
    private javax.swing.JTextField _customerInstallationDate;
    private javax.swing.JTextField _customerName;
    private javax.swing.JTextField _customerPackCost;
    private javax.swing.JTextField _customerPackDuration;
    private javax.swing.JComboBox _customerPackId;
    private javax.swing.JTextField _customerPackName;
    private javax.swing.JTextField _customerPhone;
    private javax.swing.JPanel _customerProfile;
    private javax.swing.JButton _dashboardButton;
    private javax.swing.JButton _deleteArea;
    private javax.swing.JTextField _deleteAreaId;
    private javax.swing.JPanel _home;
    private javax.swing.JButton _logout15;
    private javax.swing.JButton _logout16;
    private javax.swing.JButton _logout17;
    private javax.swing.JButton _logout18;
    private javax.swing.JButton _logout19;
    private javax.swing.JButton _logout20;
    private javax.swing.JButton _logout21;
    private javax.swing.JButton _logout22;
    private javax.swing.JButton _logout23;
    private javax.swing.JButton _operationsButton;
    private javax.swing.JButton _packageCancelButton;
    private javax.swing.JButton _packageCreateButton;
    private javax.swing.JPanel _packages;
    private javax.swing.JButton _packagesButton;
    private javax.swing.JPanel _payment;
    private javax.swing.JPanel _paymentHistory;
    private javax.swing.JPanel _pendingReport;
    private javax.swing.JPanel _product;
    private javax.swing.JPanel _profile;
    private javax.swing.JButton _profile15;
    private javax.swing.JButton _profile16;
    private javax.swing.JButton _profile17;
    private javax.swing.JButton _profile19;
    private javax.swing.JButton _profile21;
    private javax.swing.JButton _profile22;
    private javax.swing.JButton _profile24;
    private javax.swing.JButton _profile25;
    private javax.swing.JButton _profile26;
    private javax.swing.JButton _profile27;
    private javax.swing.JButton _profile31;
    private javax.swing.JButton _profile32;
    private javax.swing.JButton _profile36;
    private javax.swing.JButton _profile41;
    private javax.swing.JButton _profile43;
    private javax.swing.JButton _profile46;
    private javax.swing.JPanel _profileUpdate;
    private javax.swing.JPanel _purchaseReport;
    private javax.swing.JPanel _report;
    private javax.swing.JPanel _saleReport;
    private javax.swing.JPanel _settings;
    private javax.swing.JTextField _subArea;
    private javax.swing.JLabel ac;
    private javax.swing.JComboBox arAreaName;
    private javax.swing.JComboBox arSubAreaName;
    private javax.swing.JTable assignAreaTable;
    private javax.swing.JTable assignCustTable2;
    private javax.swing.JTable assignCustomerTable;
    private javax.swing.JTable assignPackTable;
    private javax.swing.JTextField bandWidth;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField cash;
    private javax.swing.JTextField catchCustId;
    private javax.swing.JTextField due;
    private keeptoo.KGradientPanel forArea;
    private keeptoo.KGradientPanel forConnection;
    private keeptoo.KGradientPanel forCustomer;
    private keeptoo.KGradientPanel forHome;
    private keeptoo.KGradientPanel forPackages;
    private keeptoo.KGradientPanel forPayment;
    private keeptoo.KGradientPanel forProduct;
    private keeptoo.KGradientPanel forReport;
    private keeptoo.KGradientPanel forSettings;
    private javax.swing.JLabel ic;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane mainScrollPane1;
    private javax.swing.JPanel mainTopPanel;
    private javax.swing.JComboBox packBox;
    private javax.swing.JComboBox packBox2;
    private javax.swing.JTextField packCost;
    private javax.swing.JTextField packDuration;
    private javax.swing.JTextField packId;
    private javax.swing.JTextField packName;
    private javax.swing.JTable packageTable;
    private javax.swing.JPanel panelBarChart;
    private javax.swing.JPanel panelPieChart;
    private javax.swing.JTextField payBand;
    private javax.swing.JTextField payName;
    private javax.swing.JTable payTable;
    private javax.swing.JTextField pay_cust_id;
    private javax.swing.JCheckBox pay_paid;
    private javax.swing.JComboBox puAreaName;
    private javax.swing.JTextField puBandwidth;
    private javax.swing.JTextField puConType;
    private javax.swing.JTextField puCustAddress;
    private javax.swing.JTextField puCustEmail;
    private javax.swing.JTextField puCustId;
    private javax.swing.JTextField puCustName;
    private javax.swing.JTextField puCustPhone;
    private javax.swing.JTextField puInstallationDate;
    private javax.swing.JTextField puPackCost;
    private javax.swing.JTextField puPackDuration;
    private javax.swing.JComboBox puPackId;
    private javax.swing.JTextField puPackName;
    private javax.swing.JComboBox puSubAreaName;
    private javax.swing.JTextField queryBox;
    private javax.swing.JButton queryButton;
    private javax.swing.JTextField searchCustId;
    private javax.swing.JTextField setBandwidthById;
    private javax.swing.JTextField setDurationById;
    private javax.swing.JTextField setPackCostById;
    private javax.swing.JTextField setpackNameById;
    private keeptoo.KGradientPanel sidePanel;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables

    @Override
    public void createPackages() {
        String pkId = packId.getText();
        String pkName = packName.getText();
        String bw = bandWidth.getText();
        double pkCost = Double.valueOf(packCost.getText());
        int pkDuration = Integer.valueOf(packDuration.getText());
        
        Packages packages = new Packages();
        packages.setPackageId(pkId);
        packages.setPackageName(pkName);
        packages.setBandwidth(bw);
        packages.setPackageCost(pkCost);
        packages.setDuration(pkDuration);
        int status = packDAO.save(packages);
        if(status>0){
            JOptionPane.showMessageDialog(_payment, "Package saved successfully!");
            resetPackages();
            loadPackBox();
            loadPackBox2();
            loadPackBox3();
            loadPackBox5();
            loadPackBox7();
            
        } else {
            JOptionPane.showMessageDialog(_payment, "Sorry! package did not saved");
        }
        
    }

    @Override
    public void resetPackages() {
       packId.setText("");
       packName.setText("");
       bandWidth.setText("");
       packCost.setText("");
       packDuration.setText("");
    }

    @Override
    public void deletePackages() {
        
    }

    @Override
    public void viewPackages() {
        String sql = "SELECT * FROM packages WHERE pack_id = ?";
        Connection con = DBC.getDB();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, packBox.getSelectedItem().toString());
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                setpackNameById.setText(rs.getString("pack_name"));
                setBandwidthById.setText(rs.getString("bandwidth"));
                setPackCostById.setText(rs.getString("pack_cost"));
                setDurationById.setText(rs.getString("pack_duration"));
            }
        } catch (Exception e) {
        }
    }

    @Override
    public void resetUpdatePackages() {
       setpackNameById.setText("");
       setBandwidthById.setText("");
       setPackCostById.setText("");
       setDurationById.setText("");
       packBox.setSelectedItem(null);
       packBox2.setSelectedItem(null);
       
    }

    @Override
    public void updatePackages() {
        String pName = setpackNameById.getText();
        String pBandwidth = setBandwidthById.getText();
        double pCost = Double.valueOf(setPackCostById.getText());
        int pDuration = Integer.valueOf(setDurationById.getText());
        
        String sql = "UPDATE packages SET pack_name = ?, bandwidth = ?, pack_cost = ?, pack_duration =? WHERE pack_id = ?";
        Connection con = DBC.getDB();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, pName);
            pst.setString(2, pBandwidth);
            pst.setDouble(3, pCost);
            pst.setInt(4, pDuration);
            pst.setString(5, packBox.getSelectedItem().toString());
            int status = pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update successfully!");
        } catch (Exception e) {
        }
    }

    @Override
    public void saveArea() {
        String arId = _areaId.getText();
        String arName = _areaName.getText();
        String arSubName = _subArea.getText();
        String arConType = _conType.getText();
        
        Area area = new Area();
        area.setAreaId(arId);
        area.setAreaName(arName);
        area.setSubAreaName(arSubName);
        area.setConnectionType(arConType);
        int status = areaDAO.save(area);
        if(status>0){
            JOptionPane.showMessageDialog(null, "Area saved successfully!");
            loadAreaBox4();
            loadPackBox6();
            loadAreaBox8();
            loadSubAreaBox9();
            loadAreaBox10();
            loadSubAreaBox11();
        } else {
            JOptionPane.showMessageDialog(null, "Sorry! area did not saved");
        }
       
    }

    @Override
    public void resetArea() {
        _areaId.setText("");
        _areaName.setText("");
        _subArea.setText("");
        _conType.setText("");
    }

    @Override
    public void createCustomer() {
        String cId = _customerId.getText();
        String cName = _customerName.getText();
        String cPhone = _customerPhone.getText();
        String cEmail = _customerEmail.getText();
        String cInstallationDate = _customerInstallationDate.getText();
        String cArea = _customerArea.getSelectedItem().toString();
        String cAddress = _customerAddress.getText();
        String cPackId = _customerPackId.getSelectedItem().toString();
        String cSubArea = _SUBArea.getSelectedItem().toString();
        double cPackCost = Double.valueOf(_customerPackCost.getText());
        
        CreateCustomer createcustomer = new CreateCustomer();
        createcustomer.setCustomerId(cId);
        createcustomer.setCustomerName(cName);
        createcustomer.setCustomerPhone(cPhone);
        createcustomer.setCustomerEmail(cEmail);
        createcustomer.setInstallationDate(cInstallationDate);
        createcustomer.setCustomerAreaName(cArea);
        createcustomer.setCustomerAddress(cAddress);
        createcustomer.setCustomerPackageId(cPackId);
        createcustomer.setCustomerSubAreaName(cSubArea);
        createcustomer.setCustomerPackCost(cPackCost);
        int status = ccDAO.save(createcustomer);
        if(status>0){
            JOptionPane.showMessageDialog(null, "Customer info saved successfully!");
//            resetCreateCustomer();
        } else {
            JOptionPane.showMessageDialog(null, "Sorry! customer info not saved");
        }
    }

    @Override
    public void resetCreateCustomer() {
        _customerId.setText("");
        _customerName.setText("");
        _customerPhone.setText("");
        _customerEmail.setText("");
        _customerArea.setSelectedItem(null);
        _SUBArea.setSelectedItem(null);
        _customerAddress.setText("");
        _customerPackId.setSelectedItem(null);
        _customerPackName.setText("");
        _customerPackCost.setText("");
        _CustomerBandwidth.setText("");
        _customerPackDuration.setText("");
        _customerConType.setText("");
        _customerInstallationDate.setText("");
    }

    @Override
    public void saveConnection() {
        String CID = _cId.getText();
        String CPACKID = _cPackId.getSelectedItem().toString();
        String STARTDATE = _cStartDate.getDate().toString();
        String ENDDATE = _cEndDate.getDate().toString();
        String RENEWTYPE = "";
        if(_cAuto.isSelected()){
            RENEWTYPE = "Auto";
        }
        if(_cManual.isSelected()){
            RENEWTYPE = "Manual";
        }
        String ACTIVESTATUS = "";
        if(_cActive.isSelected()){
            ACTIVESTATUS = "Active";
        }
        if(_cInactive.isSelected()){
            ACTIVESTATUS = "Inactive";
        }
        
        ConnectioN CN = new ConnectioN();
        CN.setcId(CID);
        CN.setcPackId(CPACKID);
        CN.setcStartDate(STARTDATE);
        CN.setcEndDate(ENDDATE);
        CN.setcRenewType(RENEWTYPE);
        CN.setcActiveStatus(ACTIVESTATUS);
        int status = cnDAO.save(CN);
        if(status>0){
            JOptionPane.showMessageDialog(null, "Connection create successfully!");
            
        } else {
            JOptionPane.showMessageDialog(null, "Sorry! Connection not created");
        }
    }

    @Override
    public void resetConnection() {
       _cId.setText("");
       _cPackId.setSelectedItem(null);
       _cStartDate.setDate(null);
       _cEndDate.setDate(null);
       buttonGroup1.clearSelection();
       buttonGroup2.clearSelection();
      
    }

    @Override
    public void updateConnection() {
        String ucId = _cId.getText();
        String ucPackId = _cPackId.getSelectedItem().toString();
        String ucRenewType ="";
        if(_cAuto.isSelected()){
            ucRenewType = _cAuto.getText();
        }
        if(_cManual.isSelected()){
            ucRenewType = _cManual.getText();
        }
        String ucActiveStatus = "";
        if(_cActive.isSelected()){
            ucActiveStatus = _cActive.getText();
        }
        if(_cInactive.isSelected()){
            ucActiveStatus = _cInactive.getText();
        }
        
        String sql = "UPDATE customer SET renew_type = ?, active_status = ? WHERE cust_id = ?";
        Connection con = DBC.getDB();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ucRenewType);
            pst.setString(2, ucActiveStatus);
            pst.setString(3, ucId);
            int status = pst.executeUpdate();
            resetConnection();
        } catch (Exception e) {
        }
    }

    @Override
    public void saveCustomer() {
        String cCID = _customerId.getText();
        String cCNAME = _customerName.getText();
        String cCPHONE = _customerPhone.getText();
        String cCEMAIL = _customerEmail.getText();
        String cCAREANAME = _customerArea.getSelectedItem().toString();
        String cCSUBAREA = _SUBArea.getSelectedItem().toString();
        String cCADDRESS = _customerAddress.getText();
        String cCPACKID = _customerPackId.getSelectedItem().toString();
        String cCPACKNAME = _customerName.getText();
        double cCPACKCOST = Double.valueOf(_customerPackCost.getText());
        String cCBANDWIDTH = _CustomerBandwidth.getText();
        int cCPACKDURATION = Integer.valueOf(_customerPackDuration.getText());
        String cCCONTYPE = _customerConType.getText();
        String cCINSTALLATIONDATE = _customerInstallationDate.getText();
        Customer c = new Customer();
        c.setCUSTid(cCID);
        c.setCUSTname(cCNAME);
        c.setCUSTphone(cCPHONE);
        c.setCUSTemail(cCEMAIL);
        c.setCUSTareaname(cCAREANAME);
        c.setCUSTsubarea(cCSUBAREA);
        c.setCUSTaddress(cCADDRESS);
        c.setCUSTpackid(cCPACKID);
        c.setCUSTpackname(cCPACKNAME);
        c.setCUSTpackcost(cCPACKCOST);
        c.setCUSTbandwidth(cCBANDWIDTH);
        c.setCUSTpackduration(cCPACKDURATION);
        c.setCUSTcontype(cCCONTYPE);
        c.setCUSTinstallationdate(cCINSTALLATIONDATE);
        int status = cDAO.save(c);
    }

    @Override
    public void updateCustomerTable() {
//        String PKid = packId.getText();
//        String PKname = packName.getText();
//        String PKbandwidth = bandWidth.getText();
//        double PKcost = Double.valueOf(packCost.getText());
//        int PKduration = Integer.valueOf(packDuration.getText());
//        
//        String sql = "UPDATE customer SET pack_name = ?, bandwidth = ?, pack_cost = ?, pack_duration = ? WHERE pack_id = ?";
//        Connection con = DBC.getDB();
//        try {
//            PreparedStatement pst = con.prepareStatement(sql);
//            pst.setString(1, PKname);
//            pst.setString(2, PKbandwidth);
//            pst.setDouble(3, PKcost);
//            pst.setInt(4, PKduration);
//            pst.setString(5, PKid);
//            int status = pst.executeUpdate();
//            JOptionPane.showMessageDialog(null, "Update successfully!");
//        } catch (Exception e) {
//        }
    }

    @Override
    public void viewPackOnCreateCustomer() {
        String sql = "SELECT * FROM packages WHERE pack_id = ?";
        Connection con = DBC.getDB();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, _customerPackId.getSelectedItem().toString());
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                _customerPackName.setText(rs.getString("pack_name"));
                _CustomerBandwidth.setText(rs.getString("bandwidth"));
                _customerPackCost.setText(Double.valueOf(rs.getString("pack_cost")).toString());
                _customerPackDuration.setText(Integer.valueOf(rs.getString("pack_duration")).toString());
            }
        } catch (Exception e) {
        }
    }

    @Override
    public void resetProfileUpdateData() {
        catchCustId.setText("");
        puCustId.setText("");
        puCustName.setText("");
        puCustPhone.setText("");
        puCustEmail.setText("");
        puAreaName.setSelectedItem(null);
        puSubAreaName.setSelectedItem(null);
        puCustAddress.setText("");
        puPackId.setSelectedItem(null);
        puPackName.setText("");
        puPackCost.setText("");
        puBandwidth.setText("");
        puPackDuration.setText("");
        puConType.setText("");
        puInstallationDate.setText("");
    }

    @Override
    public void viewUpdatePackData() {
        String sql = "SELECT * FROM customer WHERE cust_id = ?";
        Connection con = DBC.getDB();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, catchCustId.getText());
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                puCustId.setText(rs.getString("cust_id"));
                puCustName.setText(rs.getString("cust_name"));
                puCustPhone.setText(rs.getString("cust_phone"));
                puCustEmail.setText(rs.getString("cust_email"));
                puAreaName.setSelectedItem(rs.getString("area_name"));
                puSubAreaName.setSelectedItem(rs.getString("sub_area"));
                puCustAddress.setText(rs.getString("cust_address"));
                puPackId.setSelectedItem(rs.getString("pack_id"));
                puPackName.setText(rs.getString("pack_name"));
                puPackCost.setText(rs.getString("pack_cost"));
                puBandwidth.setText(rs.getString("bandwidth"));
                puPackDuration.setText(rs.getString("pack_duration"));
                puConType.setText(rs.getString("con_type"));
                puInstallationDate.setText(rs.getString("installation_date"));
            }
        } catch (Exception e) {
        }
    }

    @Override
    public void resetAr() {
        arAreaName.setSelectedItem(null);
        arSubAreaName.setSelectedItem(null);
    }

    @Override
    public void updateCustomerProfile() {
        String ucpId = puCustId.getText();
        String ucpName = puCustName.getText();
        String ucpPhone = puCustPhone.getText();
        String ucpEmail = puCustEmail.getText();
        String ucpArea = puAreaName.getSelectedItem().toString();
        String ucpSubArea = puSubAreaName.getSelectedItem().toString();
        String ucpAddress = puCustAddress.getText();
        String ucpPackId = puPackId.getSelectedItem().toString();
        String ucpPackName = puPackName.getText();
        double ucpPackCost = Double.valueOf(puPackCost.getText());
        String ucpBandwidth = puBandwidth.getText();
        int ucpPackDuration = Integer.valueOf(puPackDuration.getText());
        String ucpConType = puConType.getText();
        String ucpInstallationDate = puInstallationDate.getText();
        String ucpSearchCustId = catchCustId.getText();
        
        String sql = "UPDATE customer SET cust_id = ?, cust_name = ?, cust_phone = ?, cust_email = ?, area_name = ?, sub_area = ?, cust_address = ?, pack_id = ?, pack_name = ?, pack_cost = ?, bandwidth = ?, pack_duration = ?, con_type = ?, installation_date = ? WHERE cust_id = ?";
        Connection con = DBC.getDB();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ucpId);
            pst.setString(2, ucpName);
            pst.setString(3, ucpPhone);
            pst.setString(4, ucpEmail);
            pst.setString(5, ucpArea);
            pst.setString(6, ucpSubArea);
            pst.setString(7, ucpAddress);
            pst.setString(8, ucpPackId);
            pst.setString(9, ucpPackName);
            pst.setDouble(10, ucpPackCost);
            pst.setString(11, ucpBandwidth);
            pst.setInt(12, ucpPackDuration);
            pst.setString(13, ucpConType);
            pst.setString(14, ucpInstallationDate);
            pst.setString(15, ucpSearchCustId);
            int status = pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update successfully!");
        } catch (Exception e) {
        }
    }

    @Override
    public void updateCon1() {
        String CID = _cId.getText();
        String CPACKID = _cPackId.getSelectedItem().toString();
        String STARTDATE = _cStartDate.getDate().toString();
        String ENDDATE = _cEndDate.getDate().toString();
        String RENEWTYPE = "";
        if(_cAuto.isSelected()){
            RENEWTYPE = "Auto";
        }
        if(_cManual.isSelected()){
            RENEWTYPE = "Manual";
        }
        String ACTIVESTATUS = "";
        if(_cActive.isSelected()){
            ACTIVESTATUS = "Active";
        }
        if(_cInactive.isSelected()){
            ACTIVESTATUS = "Inactive";
        }
        
        String sql = "UPDATE connection SET start_date = ?, end_date = ?, renew_type = ?, active_status = ? WHERE cust_id = ?";
        Connection con = DBC.getDB();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, STARTDATE);
            pst.setString(2, ENDDATE);
            pst.setString(3, RENEWTYPE);
            pst.setString(4, ACTIVESTATUS);
            pst.setString(5, CID);
            int status = pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update Successfully!");
        } catch (Exception e) {
        }
    }

    @Override
    public void updateCon2() {
        String CID = _cId.getText();
        String CPACKID = _cPackId.getSelectedItem().toString();
        String STARTDATE = _cStartDate.getDate().toString();
        String ENDDATE = _cEndDate.getDate().toString();
        String RENEWTYPE = "";
        if(_cAuto.isSelected()){
            RENEWTYPE = "Auto";
        }
        if(_cManual.isSelected()){
            RENEWTYPE = "Manual";
        }
        String ACTIVESTATUS = "";
        if(_cActive.isSelected()){
            ACTIVESTATUS = "Active";
        }
        if(_cInactive.isSelected()){
            ACTIVESTATUS = "Inactive";
        }
        
        String sql = "UPDATE customer SET renew_type = ?, active_status = ? WHERE cust_id = ?";
        Connection con = DBC.getDB();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, RENEWTYPE);
            pst.setString(2, ACTIVESTATUS);
            pst.setString(3, CID);
            int status = pst.executeUpdate();
            resetConnection();
        } catch (Exception e) {
        }
    }
    public void showPieChart(){
        DefaultPieDataset barDataset = new DefaultPieDataset();
        barDataset.setValue("Sale", new Double(20.00));
        barDataset.setValue("Purchase", new Double(35.00));
        barDataset.setValue("Stock In", new Double(30.00));
        barDataset.setValue("Profit", new Double(15.00));
        
        JFreeChart pieChart = ChartFactory.createPieChart("Product Report", barDataset, false, true, false);
        PiePlot piePlot = (PiePlot) pieChart.getPlot();
        
        piePlot.setSectionPaint("Sale", new Color(65, 105, 225));
        piePlot.setSectionPaint("Purchase", new Color(0, 128, 128));
        piePlot.setSectionPaint("Stock In", new Color(176, 196, 222));
        piePlot.setSectionPaint("Profit", new Color(199, 21, 133));
        
        piePlot.setBackgroundPaint(Color.WHITE);
        
        ChartPanel barChartPanel = new ChartPanel(pieChart);
        panelPieChart.removeAll();
        panelPieChart.add(barChartPanel, BorderLayout.CENTER);
        panelPieChart.validate();
    }
    
    public void showBarChart(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.setValue(200000, "Earn", "January");
        dataSet.setValue(185000, "Earn", "February");
        dataSet.setValue(195000, "Earn", "March");
        dataSet.setValue(210000, "Earn", "April");
        dataSet.setValue(200000, "Earn", "May");
        dataSet.setValue(195000, "Earn", "June");
        
        JFreeChart barChart = ChartFactory.createBarChart("Collection", "Monthly", "Amount", 
                dataSet, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot categoryPlot = barChart.getCategoryPlot();
        categoryPlot.setBackgroundPaint(Color.WHITE);
        
        BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();
        Color clr = new Color(25, 25, 112);
        renderer.setSeriesPaint(0, clr);
        
        ChartPanel barChartPanel = new ChartPanel(barChart);
        panelBarChart.removeAll();
        panelBarChart.add(barChartPanel, BorderLayout.CENTER);
        panelBarChart.validate();
    }
    
    public void activeStatus(){
        String sql = "SELECT * FROM connection WHERE active_status = ?";
        String sql1 = "Active";
        Connection con = DBC.getDB();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, sql1);
            ResultSet rs = pst.executeQuery();
            int active = 0;
            while(rs.next()){
                if(rs.getString("active_status").equals(sql1)){
                    active++;
                }
                
            }
            ac.setText(String.valueOf(active));
            //System.out.println(active + "...............");
        } catch (Exception e) {
        }
    }
    
    public void viewInvoice(){
        String sql = "SELECT * FROM customer WHERE cust_id = ?";
        Connection con = DBC.getDB();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, queryBox.getText());
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                payName.setText(rs.getString("cust_name"));
                payBand.setText(rs.getString("bandwidth"));
                cash.setText(rs.getString("pack_cost"));
            }
        } catch (Exception e) {
        }
        paymentModel = new DefaultTableModel();
        paymentModel.addColumn("Customer ID");
        paymentModel.addColumn("Start Date");
        paymentModel.addColumn("End Date");
        String sql1 = "SELECT * FROM connection WHERE cust_id = ?";
        Connection con1 = DBC.getDB();
        try {
            PreparedStatement pst = con1.prepareStatement(sql1);
            pst.setString(1, queryBox.getText());
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                String ci = rs.getString("cust_id");
                String csd = rs.getString("start_date");
                String ced = rs.getString("end_date");
                Object[] rowdata = {ci, csd, ced};
                paymentModel.addRow(rowdata);
            }
            payTable.setModel(paymentModel);
        } catch (Exception e) {
        }
        due.setText("0");
       
    }
    
    public double total(){
        double Cash = Double.valueOf(cash.getText());
        double Due = Double.valueOf(due.getText());
        double Total = (Cash + Due);
        return Total;
    } 
    
    public void inactiveStatus(){
        String sql = "SELECT * FROM connection WHERE active_status = ?";
        String sql1 = "Inactive";
        Connection con = DBC.getDB();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, sql1);
            ResultSet rs = pst.executeQuery();
            int active = 0;
            while(rs.next()){
                if(rs.getString("active_status").equals(sql1)){
                    active++;
                }
                
            }
            ic.setText(String.valueOf(active));
            //System.out.println(active + "...............");
        } catch (Exception e) {
        }
    }
    
    public void viewPayment1(){
        payModel1 = new DefaultTableModel();
        payModel1.addColumn("Customer ID");
        payModel1.addColumn("Package ID");
        payModel1.addColumn("Start Date");
        payModel1.addColumn("End Date");
        payModel1.addColumn("Renew");
        payModel1.addColumn("Active Status");
        payModel1.addColumn("Payment");
        String sql1 = "SELECT * FROM connection WHERE cust_id = ?";
        Connection con1 = DBC.getDB();
        try {
            PreparedStatement pst = con1.prepareStatement(sql1);
            pst.setString(1, pay_cust_id.getText());
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                String Pci = rs.getString("cust_id");
                String Ppi = rs.getString("pack_id");
                String Psd = rs.getString("start_date");
                String Ped = rs.getString("end_date");
                String Prt = rs.getString("renew_type");
                String Pas = rs.getString("active_status");
                Object[] rowdata = {Pci, Ppi, Psd, Ped, Prt, Pas};
                payModel1.addRow(rowdata);
            }
            Ptable1.setModel(payModel1);
        } catch (Exception e) {
        } 
    }
    
    public void viewPayment2(){
        payModel1 = new DefaultTableModel();
        payModel1.addColumn("Customer ID");
        payModel1.addColumn("Package ID");
        payModel1.addColumn("Start Date");
        payModel1.addColumn("End Date");
        payModel1.addColumn("Renew");
        payModel1.addColumn("Active Status");
        payModel1.addColumn("Payment");
        String sql1 = "SELECT * FROM connection WHERE cust_id = ?";
        Connection con1 = DBC.getDB();
        try {
            PreparedStatement pst = con1.prepareStatement(sql1);
            pst.setString(1, pay_cust_id.getText());
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                String Pci = rs.getString("cust_id");
                String Ppi = rs.getString("pack_id");
                String Psd = rs.getString("start_date");
                String Ped = rs.getString("end_date");
                String Prt = rs.getString("renew_type");
                String Pas = rs.getString("active_status");
                String Pp = null;
                if(pay_paid.isSelected()){
                    Pp = "Paid";
                }
                Object[] rowdata = {Pci, Ppi, Psd, Ped, Prt, Pas, Pp};
                payModel1.addRow(rowdata);
            }
            Ptable1.setModel(payModel1);
        } catch (Exception e) {
        }
    }
    
    public void savePayment(){
        int status = 0;
        String sql1 = "SELECT * FROM connection WHERE cust_id = ?";
        Connection con1 = DBC.getDB();
        String sql = "INSERT INTO payment (cust_id, pack_id, start_date, end_date, renew_type, active_status, pay_ment) VALUES (?, ?, ?, ?, ?, ?, ?)";
        Connection con = DBC.getDB();
        try {
            PreparedStatement pst1 = con1.prepareStatement(sql1);
            pst1.setString(1, pay_cust_id.getText());
            ResultSet rs = pst1.executeQuery();
            String Pci = rs.getString("cust_id");
            String Ppi = rs.getString("pack_id");
            String Psd = rs.getString("start_date");
            String Ped = rs.getString("end_date");
            String Prt = rs.getString("renew_type");
            String Pas = rs.getString("active_status");
            String Pp = "Paid";

            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, Pci);
            pst.setString(2, Ppi);
            pst.setString(3, Psd);
            pst.setString(4, Ped);
            pst.setString(5, Prt);
            pst.setString(6, Pas);
            pst.setString(7, Pp);
            status = pst.executeUpdate();
        } catch (Exception e) {
        }
    
    }
    
    public void viewPaymentHistory(){
        payModel2 = new DefaultTableModel();
        payModel2.addColumn("Customer ID");
        payModel2.addColumn("Package ID");
        payModel2.addColumn("Start Date");
        payModel2.addColumn("End Date");
        payModel2.addColumn("Renew");
        payModel2.addColumn("Active Status");
        payModel2.addColumn("Payment");
        String sql1 = "SELECT * FROM connection WHERE cust_id = ?";
        Connection con1 = DBC.getDB();
        try {
            PreparedStatement pst = con1.prepareStatement(sql1);
            pst.setString(1, pay_cust_id.getText());
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                String Pci = rs.getString("cust_id");
                String Ppi = rs.getString("pack_id");
                String Psd = rs.getString("start_date");
                String Ped = rs.getString("end_date");
                String Prt = rs.getString("renew_type");
                String Pas = rs.getString("active_status");
                String Pp = null;
                if(pay_paid.isSelected()){
                    Pp = "Paid";
                }
                Object[] rowdata = {Pci, Ppi, Psd, Ped, Prt, Pas, Pp};
                payModel2.addRow(rowdata);
            }
            Ptable2.setModel(payModel2);
        } catch (Exception e) {
        }
    }
}
