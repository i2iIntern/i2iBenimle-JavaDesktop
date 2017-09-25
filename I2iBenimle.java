package i2i.benimle;
    
import i2i_benimle.Campaign;
import i2i_benimle.Tariff;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


/**
 *
 * @author Furkan KAYALI
 */

public class I2iBenimle extends javax.swing.JFrame {
     WsConnection wsPort = new WsConnection();
     
     Msisdn msisdn;
     Contract contract;
     Customer customer;
     List<Campaign> campaigns = wsPort.service.getDbi2IBenimlePort().getCampaign();
     List<Tariff> ratePlans = wsPort.service.getDbi2IBenimlePort().getRateplanList();
     public static Logger logger;
     
    public I2iBenimle() {
        initComponents();
        configureLog4j();
        getLoginPage();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        panelAddBalance = new javax.swing.JPanel();
        buttonAddBalance = new javax.swing.JButton();
        comboBoxMoney = new javax.swing.JComboBox();
        fieldMsisdn = new javax.swing.JTextField();
        labelPrice = new javax.swing.JLabel();
        labelMsisdn = new javax.swing.JLabel();
        panelAddBalanceError = new javax.swing.JPanel();
        labelAddBalanceError = new javax.swing.JLabel();
        panelWelcome = new javax.swing.JPanel();
        labelWelcome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelHomePageMsisdn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelHomePageRatePlanName = new javax.swing.JLabel();
        panelRemaining = new javax.swing.JPanel();
        labelRemainingVoice = new javax.swing.JLabel();
        labelRemainingData = new javax.swing.JLabel();
        labelBalance = new javax.swing.JLabel();
        labelRemainingSms = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelVoiceDate = new javax.swing.JLabel();
        labelDataDate = new javax.swing.JLabel();
        labelSmsDate = new javax.swing.JLabel();
        progressBarVoice = new javax.swing.JProgressBar();
        progressBarData = new javax.swing.JProgressBar();
        progressBarSms = new javax.swing.JProgressBar();
        panelRecipe = new javax.swing.JPanel();
        comboBoxRecipe = new javax.swing.JComboBox<>();
        labelRecipeTitle = new javax.swing.JLabel();
        labelRecipeContent = new javax.swing.JLabel();
        labelDataAmount = new javax.swing.JLabel();
        labelVoiceAmount = new javax.swing.JLabel();
        labelSmsAmount = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panelCampaigns = new javax.swing.JPanel();
        comboBoxCampaigns = new javax.swing.JComboBox<>();
        labelCampaignsTitle = new javax.swing.JLabel();
        labelCampaignsContent = new javax.swing.JLabel();
        labelCampaignsRules = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        panelAddBalanceSuccess = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labelSuccessPrice = new javax.swing.JLabel();
        labelSuccessMsisdn = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        menuButtonAddBalance = new javax.swing.JButton();
        menuButtonRecipePage = new javax.swing.JButton();
        menuButtonRemainingPage = new javax.swing.JButton();
        mButtonLogOut = new javax.swing.JButton();
        menuButtonCampaigns = new javax.swing.JButton();
        panelAppTitle = new javax.swing.JPanel();
        labelIcon = new javax.swing.JLabel();
        labelTitle = new javax.swing.JLabel();
        panelLogin = new javax.swing.JPanel();
        buttonLogin = new javax.swing.JButton();
        labelPhNum = new javax.swing.JLabel();
        labelPasswd = new javax.swing.JLabel();
        fieldPhoneNumber = new javax.swing.JTextField();
        fieldPassword = new javax.swing.JPasswordField();
        labelInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("İ2İ Benimle");
        setBackground(new java.awt.Color(52, 170, 220));
        setMaximumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(1050, 900));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));

        panelMain.setBackground(new java.awt.Color(52, 170, 220));
        panelMain.setPreferredSize(new java.awt.Dimension(900, 724));

        panelAddBalance.setBackground(new java.awt.Color(52, 170, 220));
        panelAddBalance.setPreferredSize(new java.awt.Dimension(900, 724));

        buttonAddBalance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonAddBalance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add-icon.png"))); // NOI18N
        buttonAddBalance.setText("TL Yükle");
        buttonAddBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddBalanceActionPerformed(evt);
            }
        });

        comboBoxMoney.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboBoxMoney.setMaximumRowCount(100);
        comboBoxMoney.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "20", "30", "40", "50" }));
        comboBoxMoney.setToolTipText("");
        comboBoxMoney.setInheritsPopupMenu(true);
        comboBoxMoney.setKeySelectionManager(null);
        comboBoxMoney.setName(""); // NOI18N
        comboBoxMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxMoneyActionPerformed(evt);
            }
        });

        fieldMsisdn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldMsisdn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fieldMsisdn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldMsisdnActionPerformed(evt);
            }
        });
        fieldMsisdn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldMsisdnKeyTyped(evt);
            }
        });

        labelPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPrice.setForeground(new java.awt.Color(255, 255, 255));
        labelPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPrice.setText("Miktar");

        labelMsisdn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelMsisdn.setForeground(new java.awt.Color(255, 255, 255));
        labelMsisdn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMsisdn.setText("Yükleme Yapılacak Numara");
        labelMsisdn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        panelAddBalanceError.setBackground(new java.awt.Color(52, 170, 220));

        labelAddBalanceError.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelAddBalanceError.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelAddBalanceErrorLayout = new javax.swing.GroupLayout(panelAddBalanceError);
        panelAddBalanceError.setLayout(panelAddBalanceErrorLayout);
        panelAddBalanceErrorLayout.setHorizontalGroup(
            panelAddBalanceErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddBalanceErrorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelAddBalanceError)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAddBalanceErrorLayout.setVerticalGroup(
            panelAddBalanceErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddBalanceErrorLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(labelAddBalanceError)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelAddBalanceLayout = new javax.swing.GroupLayout(panelAddBalance);
        panelAddBalance.setLayout(panelAddBalanceLayout);
        panelAddBalanceLayout.setHorizontalGroup(
            panelAddBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddBalanceLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(panelAddBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelAddBalanceError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMsisdn, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(fieldMsisdn)
                    .addComponent(buttonAddBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelAddBalanceLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(comboBoxMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelAddBalanceLayout.setVerticalGroup(
            panelAddBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddBalanceLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(labelMsisdn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldMsisdn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(buttonAddBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAddBalanceError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(264, Short.MAX_VALUE))
        );

        panelWelcome.setBackground(new java.awt.Color(52, 170, 220));
        panelWelcome.setPreferredSize(new java.awt.Dimension(900, 724));

        labelWelcome.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelWelcome.setForeground(new java.awt.Color(255, 255, 255));
        labelWelcome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelWelcome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelWelcome.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hoş Geldiniz");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Numaranız :");

        labelHomePageMsisdn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelHomePageMsisdn.setForeground(new java.awt.Color(255, 255, 255));
        labelHomePageMsisdn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelHomePageMsisdn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tarifeniz :");

        labelHomePageRatePlanName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelHomePageRatePlanName.setForeground(new java.awt.Color(255, 255, 255));
        labelHomePageRatePlanName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelHomePageRatePlanName.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout panelWelcomeLayout = new javax.swing.GroupLayout(panelWelcome);
        panelWelcome.setLayout(panelWelcomeLayout);
        panelWelcomeLayout.setHorizontalGroup(
            panelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWelcomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelWelcomeLayout.createSequentialGroup()
                        .addGroup(panelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelHomePageMsisdn, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelHomePageRatePlanName, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(621, 621, 621))
                    .addGroup(panelWelcomeLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelWelcomeLayout.setVerticalGroup(
            panelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWelcomeLayout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addGroup(panelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHomePageMsisdn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(labelHomePageRatePlanName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(362, Short.MAX_VALUE))
        );

        panelRemaining.setBackground(new java.awt.Color(52, 170, 220));
        panelRemaining.setPreferredSize(new java.awt.Dimension(900, 724));

        labelRemainingVoice.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelRemainingVoice.setForeground(new java.awt.Color(255, 255, 255));

        labelRemainingData.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelRemainingData.setForeground(new java.awt.Color(255, 255, 255));

        labelBalance.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelBalance.setForeground(new java.awt.Color(255, 255, 255));

        labelRemainingSms.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelRemainingSms.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Kalan Dakika");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kalan TL");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Kalan Sms");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Kalan İnternet");

        labelVoiceDate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelVoiceDate.setForeground(new java.awt.Color(255, 255, 255));

        labelDataDate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelDataDate.setForeground(new java.awt.Color(255, 255, 255));

        labelSmsDate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelSmsDate.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelRemainingLayout = new javax.swing.GroupLayout(panelRemaining);
        panelRemaining.setLayout(panelRemainingLayout);
        panelRemainingLayout.setHorizontalGroup(
            panelRemainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRemainingLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(panelRemainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelRemainingLayout.createSequentialGroup()
                        .addComponent(progressBarSms, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelRemainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelRemainingSms, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSmsDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelRemainingLayout.createSequentialGroup()
                        .addGroup(panelRemainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(progressBarVoice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(progressBarData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRemainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRemainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelRemainingVoice, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelBalance, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                                .addComponent(labelRemainingData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(labelDataDate, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelVoiceDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 110, Short.MAX_VALUE))
        );
        panelRemainingLayout.setVerticalGroup(
            panelRemainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRemainingLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(panelRemainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(labelBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRemainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(progressBarVoice, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRemainingLayout.createSequentialGroup()
                        .addComponent(labelRemainingVoice, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelVoiceDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRemainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRemainingLayout.createSequentialGroup()
                        .addComponent(labelRemainingData, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDataDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(progressBarData, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelRemainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelRemainingLayout.createSequentialGroup()
                        .addComponent(labelRemainingSms, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelSmsDate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(progressBarSms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(173, Short.MAX_VALUE))
        );

        panelRecipe.setBackground(new java.awt.Color(52, 170, 220));
        panelRecipe.setPreferredSize(new java.awt.Dimension(900, 724));

        comboBoxRecipe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxRecipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxRecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxRecipeActionPerformed(evt);
            }
        });
        comboBoxRecipe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                comboBoxRecipeKeyTyped(evt);
            }
        });

        labelRecipeTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelRecipeTitle.setForeground(new java.awt.Color(255, 255, 255));

        labelRecipeContent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelRecipeContent.setForeground(new java.awt.Color(255, 255, 255));

        labelDataAmount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelDataAmount.setForeground(new java.awt.Color(255, 255, 255));

        labelVoiceAmount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelVoiceAmount.setForeground(new java.awt.Color(255, 255, 255));

        labelSmsAmount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelSmsAmount.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tarifeler");

        javax.swing.GroupLayout panelRecipeLayout = new javax.swing.GroupLayout(panelRecipe);
        panelRecipe.setLayout(panelRecipeLayout);
        panelRecipeLayout.setHorizontalGroup(
            panelRecipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRecipeLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panelRecipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDataAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelVoiceAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSmsAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRecipeContent, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxRecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRecipeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(621, Short.MAX_VALUE))
        );
        panelRecipeLayout.setVerticalGroup(
            panelRecipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRecipeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxRecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(labelRecipeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(labelRecipeContent, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelDataAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelVoiceAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSmsAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(301, Short.MAX_VALUE))
        );

        panelCampaigns.setBackground(new java.awt.Color(52, 170, 220));
        panelCampaigns.setPreferredSize(new java.awt.Dimension(900, 724));

        comboBoxCampaigns.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxCampaigns.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxCampaigns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCampaignsActionPerformed(evt);
            }
        });

        labelCampaignsTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelCampaignsTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelCampaignsTitle.setToolTipText("");

        labelCampaignsContent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelCampaignsContent.setForeground(new java.awt.Color(255, 255, 255));
        labelCampaignsContent.setToolTipText("");

        labelCampaignsRules.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelCampaignsRules.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Kampanyalar");

        javax.swing.GroupLayout panelCampaignsLayout = new javax.swing.GroupLayout(panelCampaigns);
        panelCampaigns.setLayout(panelCampaignsLayout);
        panelCampaignsLayout.setHorizontalGroup(
            panelCampaignsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCampaignsLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panelCampaignsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCampaignsContent, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCampaignsRules, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxCampaigns, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCampaignsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(418, Short.MAX_VALUE))
        );
        panelCampaignsLayout.setVerticalGroup(
            panelCampaignsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCampaignsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxCampaigns, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(labelCampaignsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(labelCampaignsContent, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCampaignsRules, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(255, Short.MAX_VALUE))
        );

        panelAddBalanceSuccess.setBackground(new java.awt.Color(52, 170, 220));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Yükleme yapılan numara:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Yüklenen miktar");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Yükleme işleminiz başarıyla gerçekleşmiştir teşekkür ederiz");

        labelSuccessPrice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelSuccessPrice.setForeground(new java.awt.Color(255, 255, 255));

        labelSuccessMsisdn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelSuccessMsisdn.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelAddBalanceSuccessLayout = new javax.swing.GroupLayout(panelAddBalanceSuccess);
        panelAddBalanceSuccess.setLayout(panelAddBalanceSuccessLayout);
        panelAddBalanceSuccessLayout.setHorizontalGroup(
            panelAddBalanceSuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddBalanceSuccessLayout.createSequentialGroup()
                .addGroup(panelAddBalanceSuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddBalanceSuccessLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(panelAddBalanceSuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAddBalanceSuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSuccessPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSuccessMsisdn, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelAddBalanceSuccessLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(544, Short.MAX_VALUE))
        );
        panelAddBalanceSuccessLayout.setVerticalGroup(
            panelAddBalanceSuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddBalanceSuccessLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addGroup(panelAddBalanceSuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSuccessMsisdn, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAddBalanceSuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSuccessPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(342, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAddBalance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1199, Short.MAX_VALUE)
            .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, 1199, Short.MAX_VALUE))
            .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelRemaining, javax.swing.GroupLayout.DEFAULT_SIZE, 1199, Short.MAX_VALUE))
            .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelRecipe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1199, Short.MAX_VALUE))
            .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelCampaigns, javax.swing.GroupLayout.DEFAULT_SIZE, 1199, Short.MAX_VALUE))
            .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelAddBalanceSuccess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAddBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelRemaining, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelRecipe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelCampaigns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelAddBalanceSuccess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMenu.setBackground(new java.awt.Color(52, 170, 220));

        menuButtonAddBalance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menuButtonAddBalance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add.png"))); // NOI18N
        menuButtonAddBalance.setText("TL Yükle");
        menuButtonAddBalance.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuButtonAddBalance.setBorderPainted(false);
        menuButtonAddBalance.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuButtonAddBalance.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuButtonAddBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonAddBalanceActionPerformed(evt);
            }
        });

        menuButtonRecipePage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menuButtonRecipePage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/contract (1).png"))); // NOI18N
        menuButtonRecipePage.setText("Tarifeler");
        menuButtonRecipePage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuButtonRecipePage.setBorderPainted(false);
        menuButtonRecipePage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuButtonRecipePage.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuButtonRecipePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonRecipePageActionPerformed(evt);
            }
        });

        menuButtonRemainingPage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menuButtonRemainingPage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/if_design-bump_48582.png"))); // NOI18N
        menuButtonRemainingPage.setText("Kalan Kulanımlarım");
        menuButtonRemainingPage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuButtonRemainingPage.setBorderPainted(false);
        menuButtonRemainingPage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuButtonRemainingPage.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuButtonRemainingPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonRemainingPageActionPerformed(evt);
            }
        });

        mButtonLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit.png"))); // NOI18N
        mButtonLogOut.setText("ÇIKIŞ");
        mButtonLogOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mButtonLogOut.setBorderPainted(false);
        mButtonLogOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mButtonLogOut.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mButtonLogOutActionPerformed(evt);
            }
        });

        menuButtonCampaigns.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menuButtonCampaigns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/campaigns.png"))); // NOI18N
        menuButtonCampaigns.setText("Kampanyalar");
        menuButtonCampaigns.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuButtonCampaigns.setBorderPainted(false);
        menuButtonCampaigns.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuButtonCampaigns.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuButtonCampaigns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonCampaignsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuButtonRemainingPage, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
            .addComponent(menuButtonAddBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuButtonRecipePage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuButtonCampaigns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mButtonLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addComponent(menuButtonRemainingPage, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuButtonAddBalance, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuButtonRecipePage, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(menuButtonCampaigns, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mButtonLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
        );

        panelAppTitle.setBackground(new java.awt.Color(52, 170, 220));
        panelAppTitle.setForeground(new java.awt.Color(52, 170, 220));

        labelIcon.setBackground(new java.awt.Color(52, 170, 220));
        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/i2i logo.png"))); // NOI18N

        labelTitle.setBackground(new java.awt.Color(52, 170, 220));
        labelTitle.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("i2i Benimle");

        javax.swing.GroupLayout panelAppTitleLayout = new javax.swing.GroupLayout(panelAppTitle);
        panelAppTitle.setLayout(panelAppTitleLayout);
        panelAppTitleLayout.setHorizontalGroup(
            panelAppTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAppTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                .addGap(90, 90, 90))
        );
        panelAppTitleLayout.setVerticalGroup(
            panelAppTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAppTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAppTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelAppTitleLayout.createSequentialGroup()
                        .addComponent(labelIcon)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panelLogin.setBackground(new java.awt.Color(52, 170, 220));
        panelLogin.setPreferredSize(new java.awt.Dimension(815, 773));

        buttonLogin.setBackground(new java.awt.Color(204, 204, 255));
        buttonLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonLogin.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Login-icon.png"))); // NOI18N
        buttonLogin.setText("GİRİŞ YAP");
        buttonLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        buttonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        labelPhNum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelPhNum.setForeground(new java.awt.Color(255, 255, 255));
        labelPhNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPhNum.setText("Telefon Numarası");

        labelPasswd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelPasswd.setForeground(new java.awt.Color(255, 255, 255));
        labelPasswd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPasswd.setText("Şifre");

        fieldPhoneNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldPhoneNumber.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fieldPhoneNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fieldPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPhoneNumberActionPerformed(evt);
            }
        });
        fieldPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldPhoneNumberKeyTyped(evt);
            }
        });

        fieldPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldPassword.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPasswordActionPerformed(evt);
            }
        });

        labelInfo.setBackground(new java.awt.Color(255, 255, 255));
        labelInfo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        labelInfo.setForeground(new java.awt.Color(255, 255, 255));
        labelInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPhNum, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPasswd, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(labelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(labelPhNum, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fieldPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(labelPasswd, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelAppTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
                    .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(panelAppTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 763, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 281, Short.MAX_VALUE)
                    .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        isLogin(fieldPhoneNumber.getText(),fieldPassword.getText());
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void fieldPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPhoneNumberActionPerformed

    }//GEN-LAST:event_fieldPhoneNumberActionPerformed

    private void fieldPhoneNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldPhoneNumberKeyTyped
        if(fieldPhoneNumber.getText().length()>=11) {
            fieldPhoneNumber.setText(fieldPhoneNumber.getText().substring(10, 1));
        }
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter)) ){
            evt.consume();
        }
    }//GEN-LAST:event_fieldPhoneNumberKeyTyped

    private void fieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPasswordActionPerformed

    }//GEN-LAST:event_fieldPasswordActionPerformed

    private void comboBoxMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxMoneyActionPerformed
        
    }//GEN-LAST:event_comboBoxMoneyActionPerformed

    private void menuButtonAddBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonAddBalanceActionPerformed
        showAddBalancePage();
    }//GEN-LAST:event_menuButtonAddBalanceActionPerformed

    private void menuButtonRemainingPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonRemainingPageActionPerformed
        showRemainingPage();
    }//GEN-LAST:event_menuButtonRemainingPageActionPerformed

    private void menuButtonRecipePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonRecipePageActionPerformed
        showRatePlanPage();
    }//GEN-LAST:event_menuButtonRecipePageActionPerformed

    private void menuButtonCampaignsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonCampaignsActionPerformed
        showCampaignsPage();
    }//GEN-LAST:event_menuButtonCampaignsActionPerformed

    private void mButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mButtonLogOutActionPerformed
        getLoginPage(); 
    }//GEN-LAST:event_mButtonLogOutActionPerformed

    private void buttonAddBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddBalanceActionPerformed
        labelAddBalanceError.setText("");
        if(fieldMsisdn.getText().isEmpty()){
            labelAddBalanceError.setText("Lütfen telefon numarası girin!");
        }else{
            if(isCorrectSize(fieldMsisdn.getText().length())){
                if(msisdn.balance.addMoney(getComboboxAddValue(),fieldMsisdn.getText())){
                    showAddBalanceSuccess();
                }
                else{
                    labelAddBalanceError.setText("Geçersiz/Kullanılamayan telefon numarası girdiniz!");
                }
            }
            else
                labelAddBalanceError.setText("Telefon numarası 11 haneli olmalıdır");
        }
    }//GEN-LAST:event_buttonAddBalanceActionPerformed

    private void comboBoxRecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxRecipeActionPerformed
        setRecipeDetails();
    }//GEN-LAST:event_comboBoxRecipeActionPerformed

    private void comboBoxRecipeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboBoxRecipeKeyTyped

    }//GEN-LAST:event_comboBoxRecipeKeyTyped

    private void comboBoxCampaignsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCampaignsActionPerformed
        setCampaignsDetail();
    }//GEN-LAST:event_comboBoxCampaignsActionPerformed

    private void fieldMsisdnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldMsisdnKeyTyped
        if(fieldPhoneNumber.getText().length()>=11) {
            fieldPhoneNumber.setText(fieldPhoneNumber.getText().substring(10, 1));
        }
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter)) ){
            evt.consume();
        }
    }//GEN-LAST:event_fieldMsisdnKeyTyped

    private void fieldMsisdnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldMsisdnActionPerformed

    }//GEN-LAST:event_fieldMsisdnActionPerformed

    private static void configureLog4j() {
    DOMConfigurator.configureAndWatch("config/log4j.xml");   //log4j konfigürasyon dosyasının projedeki yerini veriyoruz.
    logger = Logger.getLogger(I2iBenimle.class);
  }
    
    private void setCampaignsDetail(){
        labelCampaignsTitle.setText(campaigns.get((comboBoxCampaigns.getSelectedIndex())).getName());
        labelCampaignsContent.setText(campaigns.get((comboBoxCampaigns.getSelectedIndex())).getDescription());
        labelCampaignsRules.setText(campaigns.get((comboBoxCampaigns.getSelectedIndex())).getRules()); 
    }
    private void setRecipeDetails(){
        int selectedIndex;
        selectedIndex = comboBoxRecipe.getSelectedIndex();
        Tariff recipe;
        recipe = ratePlans.get(selectedIndex);

        labelRecipeTitle.setText(recipe.getName());
        labelRecipeContent.setText(recipe.getDescription());
        labelVoiceAmount.setText(""+recipe.getVoiceAmount());
        labelDataAmount.setText(""+recipe.getDataAmount());
        labelSmsAmount.setText(""+recipe.getSmsAmount());
    }
    private int getComboboxAddValue(){
        return Integer.parseInt(comboBoxMoney.getSelectedItem().toString());
    }
    
    private boolean isCorrectSize(int stringSize){
         return stringSize == 11;
    }
    private void isLogin(String msisdnVariable,String passwordVariable){
        logger.info("Bilgiler kontrol ediliyor");
        clearField();
        if( IsEmpty(msisdnVariable,passwordVariable )){
            setErrorMessage("Telefon numarası/şifre boş bırakılamaz!");
        }
        else{
            if(isCorrectSize(msisdnVariable.length())){
                logger.info("\nMsisdn: "+msisdnVariable+"\nPassword:"+passwordVariable);
                msisdn = new Msisdn(msisdnVariable, passwordVariable);
                if ( msisdn.getContractID() == -1){
                 setErrorMessage("Telefon numaranız veya şifreniz hatalıdır.\nLütfen tekrar deneyiniz.");
                }
                else{
                    I2iBenimle.logger.info("\ncustomer nesnesi oluşturuluyor...");
                    customer = new Customer(msisdn.getContractID());
                    I2iBenimle.logger.info("\ncontract nesnesi oluşturuluyor");
                    contract = new Contract(msisdn.getContractID());
                    I2iBenimle.logger.info("Ana sayfa açılıyor...");
                    showHomePage();
                }
            }
            else
                setErrorMessage("Telefon numarası 11 haneli olmalıdır.");
        }
    }
    private void clearField(){
        fieldPassword.setText("");
        fieldPhoneNumber.setText("");        
    }
    private void setErrorMessage(String message){
        labelInfo.setText(message);
    }
    private boolean IsEmpty(String msisdn,String password){
         return !(msisdn.isEmpty() == false && password.isEmpty() == false);
    }

    private void showHomePage(){
        
        labelWelcome.setText(customer.getFullName());
        labelHomePageMsisdn.setText(msisdn.getMsisdn());
        labelHomePageRatePlanName.setText(contract.ratePlan.getTitle());
        panelLogin.setVisible(false);
        panelMain.setVisible(true);
        panelMenu.setVisible(true);
        panelWelcome.setVisible(true);
    }
    
    private void showAddBalancePage(){
        hideAllPanelPage();
        I2iBenimle.logger.info("Para ekleme sayfası açılıyor...");
        panelMain.setVisible(true);
        panelAddBalance.setVisible(true);
    }
    
    
    private void showRemainingPage(){
        hideAllPanelPage();
        I2iBenimle.logger.info("Kalan kullanım sayfası açılıyor...");
        msisdn.balance.refresh(msisdn.getContractID());
        putInfoComponent();
        panelMain.setVisible(true);
        panelRemaining.setVisible(true);
    }
    private void putInfoComponent(){
        I2iBenimle.logger.info("Kalan kullanım bileşenleri yükleniyor...");
        putLabelInfo();
        putProgressBarInfo();
    }
    private void putLabelInfo(){
        labelBalance.setText(""+msisdn.balance.getMoney());
        labelRemainingData.setText( ""+  msisdn.balance.getData()    +" / "+   contract.ratePlan.getDataAmount()   +" MB");
        labelRemainingVoice.setText(""+  msisdn.balance.getVoice()   +" / "+   contract.ratePlan.getVoiceAmount()  +" Dakika");
        labelRemainingSms.setText(  ""+  msisdn.balance.getSms()     +" / "+   contract.ratePlan.getSmsAmount()    +" Sms");
        labelDataDate.setText(msisdn.balance.getDate()+" tarihine kadar geçerlidir.");
        labelVoiceDate.setText(msisdn.balance.getDate()+" tarihine kadar geçerlidir.");
        labelSmsDate.setText(msisdn.balance.getDate()+" tarihine kadar geçerlidir.");
    }
    private void putProgressBarInfo(){
        progressBarVoice.setValue(getProgressBarValue(msisdn.balance.getVoice(), contract.ratePlan.getVoiceAmount()));
        logger.info("voice : "+progressBarVoice.getValue() +"   "+msisdn.balance.getVoice()+" "+contract.ratePlan.getVoiceAmount());
        progressBarData.setValue( getProgressBarValue(msisdn.balance.getData(),  contract.ratePlan.getDataAmount()));
        logger.info("data : "+progressBarData.getValue() +"   "+msisdn.balance.getData()+" "+contract.ratePlan.getDataAmount());
        progressBarSms.setValue(  getProgressBarValue(msisdn.balance.getSms(),   contract.ratePlan.getSmsAmount()));
        logger.info("sms : "+progressBarSms.getValue() +"   "+msisdn.balance.getSms()+" "+contract.ratePlan.getSmsAmount());
    }
    private int getProgressBarValue(int remaining,int amount){
        float value = (float) remaining / (float)amount *100;
        return (int) value;
    }
    
    
    
    
    private void showRatePlanPage(){
        hideAllPanelPage();
        setComboBoxRatePlan();
        panelMain.setVisible(true);
        panelRecipe.setVisible(true);
        
    }
    private void setComboBoxRatePlan(){
        ArrayList<String> myarray = new ArrayList<>();

        for(int i = 0;i<ratePlans.size();i++){
            myarray.add(ratePlans.get(i).getName());
        }
        String[] dizi = {};
        dizi = myarray.toArray(dizi);
        comboBoxRecipe.setModel(new javax.swing.DefaultComboBoxModel<>(dizi));
    }
    
    
    private void showCampaignsPage(){
        hideAllPanelPage();
        setComboBoxCampaign();
        panelMain.setVisible(true);
        panelCampaigns.setVisible(true);
    }
        private void setComboBoxCampaign(){
        ArrayList<String> myarray = new ArrayList<>();

        for(int i = 0;i<campaigns.size();i++){
            myarray.add(campaigns.get(i).getName());
        }
        String[] dizi = {};
        dizi = myarray.toArray(dizi);
        comboBoxCampaigns.setModel(new javax.swing.DefaultComboBoxModel<>(dizi));
    }
        
    
    private void hideAllPanelPage(){
        panelMain.setVisible(false);
        panelLogin.setVisible(false);
        panelAddBalance.setVisible(false);
        panelWelcome.setVisible(false);
        panelRemaining.setVisible(false);
        panelCampaigns.setVisible(false);
        panelRecipe.setVisible(false);
        panelAddBalanceSuccess.setVisible(false);
    }
    private void showAddBalanceSuccess(){
        hideAllPanelPage();
        clearAddBalanceComponent();
        panelMain.setVisible(true);
        panelAddBalanceSuccess.setVisible(true);
    }
    
    private void clearAddBalanceComponent(){
        labelSuccessMsisdn.setText(fieldMsisdn.getText());
        fieldMsisdn.setText("");
        labelSuccessPrice.setText(""+getComboboxAddValue());
    }
    private void getLoginPage(){
        hideAllPanelPage();
        setErrorMessage("");
        panelMenu.setVisible(false);
        panelAppTitle.setVisible(true);
        panelLogin.setVisible(true);
    }

    
    
    public static void main(String args[]) {
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(I2iBenimle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        
        java.awt.EventQueue.invokeLater(() -> {
            new I2iBenimle().setVisible(true);
         });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddBalance;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JComboBox<String> comboBoxCampaigns;
    private javax.swing.JComboBox comboBoxMoney;
    private javax.swing.JComboBox<String> comboBoxRecipe;
    private javax.swing.JTextField fieldMsisdn;
    private javax.swing.JPasswordField fieldPassword;
    private javax.swing.JTextField fieldPhoneNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelAddBalanceError;
    private javax.swing.JLabel labelBalance;
    private javax.swing.JLabel labelCampaignsContent;
    private javax.swing.JLabel labelCampaignsRules;
    private javax.swing.JLabel labelCampaignsTitle;
    private javax.swing.JLabel labelDataAmount;
    private javax.swing.JLabel labelDataDate;
    private javax.swing.JLabel labelHomePageMsisdn;
    private javax.swing.JLabel labelHomePageRatePlanName;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelInfo;
    private javax.swing.JLabel labelMsisdn;
    private javax.swing.JLabel labelPasswd;
    private javax.swing.JLabel labelPhNum;
    private javax.swing.JLabel labelPrice;
    private javax.swing.JLabel labelRecipeContent;
    private javax.swing.JLabel labelRecipeTitle;
    private javax.swing.JLabel labelRemainingData;
    private javax.swing.JLabel labelRemainingSms;
    private javax.swing.JLabel labelRemainingVoice;
    private javax.swing.JLabel labelSmsAmount;
    private javax.swing.JLabel labelSmsDate;
    private javax.swing.JLabel labelSuccessMsisdn;
    private javax.swing.JLabel labelSuccessPrice;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelVoiceAmount;
    private javax.swing.JLabel labelVoiceDate;
    private javax.swing.JLabel labelWelcome;
    private javax.swing.JButton mButtonLogOut;
    private javax.swing.JButton menuButtonAddBalance;
    private javax.swing.JButton menuButtonCampaigns;
    private javax.swing.JButton menuButtonRecipePage;
    private javax.swing.JButton menuButtonRemainingPage;
    private javax.swing.JPanel panelAddBalance;
    private javax.swing.JPanel panelAddBalanceError;
    private javax.swing.JPanel panelAddBalanceSuccess;
    private javax.swing.JPanel panelAppTitle;
    private javax.swing.JPanel panelCampaigns;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelRecipe;
    private javax.swing.JPanel panelRemaining;
    private javax.swing.JPanel panelWelcome;
    private javax.swing.JProgressBar progressBarData;
    private javax.swing.JProgressBar progressBarSms;
    private javax.swing.JProgressBar progressBarVoice;
    // End of variables declaration//GEN-END:variables
}
