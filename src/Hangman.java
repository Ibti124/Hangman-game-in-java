import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;
public class Hangman {
    ////////////////////////////////////////
    static Color y= new Color(204,153,255);
    static Color q = new Color(255,246 ,231);

    static Color O = new Color(255,255 ,153);
    private static String imageIcon;
    private static String ll;
    private static String mm;
    private static String uu;


    static JLabel gifLabel = new JLabel(imageIcon) ;
    static JLabel gif2Label = new JLabel(ll) ;
    static JLabel gif3Label = new JLabel(mm) ;
    static JLabel gif4Label = new JLabel(uu) ;


    static JPanel p2 = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g) ;
            ImageIcon uu = new ImageIcon(getClass().getResource("images/jj.gif ")) ;
            Image image = uu.getImage() ;
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this) ;
        }
    } ;
    static JPanel p4 = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g) ;
            ImageIcon mm = new ImageIcon(getClass().getResource("images/g.gif.gif ")) ;
            Image image = mm.getImage() ;
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this) ;
        }
    } ;
    static Word  T = new Word();
    static ArrayList<Integer> indicesWords=new ArrayList<>();
    static String[] words = {"lion", "ford","chat","cahier","banane","Rabat"};
    static String[] domains = {"Animal", "Voiture","Animal","Ecole","Fruit","Ville Marocaine"};
    /////////////////////////////


    static String ourword="";
    static String ourdomaine="";
    static String reponse= T.initialiseWord(ourword);
    static int incorrects=1;
    static int vie =8;
    static int score=0;
    static int bestscore=0;
    static JLabel condamne = new JLabel();

    static JPanel p3 = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g) ;
            ImageIcon ll = new ImageIcon(getClass().getResource("images/coffindance-coffin.gif ")) ;
            Image image = ll.getImage() ;
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this) ;
        }
    } ;
    //////////////////// login //////////////////////


    static JPanel pLogin = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g) ;
            ImageIcon imageIcon = new ImageIcon(getClass().getResource("images/gifHangMan.gif ")) ;
            Image image = imageIcon.getImage() ;
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this) ;
        }
    } ;
    //////
    static JPanel pCreate = new JPanel(){
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g) ;
            ImageIcon imageIcon = new ImageIcon(getClass().getResource("images/gifHangMan.gif ")) ;
            Image image = imageIcon.getImage() ;
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this) ;
        }
    } ;
    private static JTextField novUsername=new JTextField();
    private static JTextField novEmail=new JTextField();
    static JFrame f=new JFrame();//creating instance of JFrame

    static JPanel p1 = new JPanel(){
        @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g ) ;
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("images/gifHangMan.gif ")) ;
        Image image = imageIcon.getImage() ;
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this) ;
    }

    };
    private static JTextField novPassword=new JPasswordField();
    private static JTextField confPassword =new JPasswordField();
    private static JLabel lblNovUsername=new JLabel("USER NAME");
    private static JLabel lblEmailUsername=new JLabel("EMAIL");

    private static JLabel lblNovPassword=new JLabel("PASSWORD");
    private static JLabel lblConfPassword=new JLabel(" CONFIRM PASSWORD");

    private static  JButton btnRegistre=new JButton("REGISTRE");
    private  static  JLabel lblLog= new JLabel("Vous avez deja \n un compte ?");
    //////

    private static JTextField textUsername=new JTextField();
    private static JTextField textPassword=new JPasswordField();
    private static JLabel lblUsername=new JLabel("EMAIL");

    private static JLabel lblPassword=new JLabel("Password");
    private static JButton btnSingn=new JButton("Login");

    private static JButton btnCreate=new JButton("Create");
    private static JButton btnClose=new JButton("Close");

    private static JButton btnLogin=new JButton("log in");
/////////////////////////////////////
    static JButton bStart=new JButton("deconnecte");//creating instance of JButton
    static JButton bRestart=new JButton("Restart");//creating instance of JButton
    static JButton bNext=new JButton("Suivant");//creating instance of JButton

    static JButton bA=new JButton("A");//creating instance of JButton
    static JButton bB=new JButton("B");//creating instance of JButton
    static JButton bC=new JButton("C");//creating instance of JButton
    static JButton bD=new JButton("D");//creating instance of JButton
    static JButton bE=new JButton("E");//creating instance of JButton
    static JButton bF=new JButton("F");//creating instance of JButton
    static JButton bG=new JButton("G");//creating instance of JButton
    static JButton bH=new JButton("H");//creating instance of JButton
    static JButton bI=new JButton("I");//creating instance of JButton
    static JButton bJ=new JButton("J");//creating instance of JButton
    static JButton bK=new JButton("K");//creating instance of JButton
    static JButton bL=new JButton("L");//creating instance of JButton
    static JButton bM=new JButton("M");//creating instance of JButton
    static JButton bN=new JButton("N");//creating instance of JButton
    static JButton bO=new JButton("O");//creating instance of JButton
    static JButton bP=new JButton("P");//creating instance of JButton
    static JButton bQ=new JButton("Q");//creating instance of JButton
    static JButton bR=new JButton("R");//creating instance of JButton
    static JButton bS=new JButton("S");//creating instance of JButton
    static JButton bT=new JButton("T");//creating instance of JButton
    static JButton bU=new JButton("U");//creating instance of JButton
    static JButton bV=new JButton("V");//creating instance of JButton
    static JButton bW=new JButton("W");//creating instance of JButton
    static JButton bX=new JButton("X");//creating instance of JButton
    static JButton bY=new JButton("Y");//creating instance of JButton
    static JButton bZ=new JButton("Z");//creating instance of JButton
    static JButton bDeconnect=new JButton("Deconnect");//creating instance of JButton
    //JFrame f=new JFrame();//creating instance of JFrame
    static JLabel domaine = new JLabel(ourdomaine);
    static JLabel word = new JLabel(T.initialiseWord(ourword));
    static JLabel scoreText = new JLabel("Score          : ");
    static JLabel vietxt = new JLabel("les vies restantes : ");
    static JLabel vielbl = new JLabel("8");
    static JLabel bestscoreText = new JLabel("Best Score : " );
    static JLabel scoreLabel = new JLabel("4");
    static JLabel bestscoreLabel = new JLabel("0");


    ///////////////////////////////////

    ///////////////////////////////////
    //????

    //????????
    public static void fin() throws IOException {
       Image imageio2 = ImageIO.read(Hangman.class.getResource("images/fin.png"));
        condamne.setIcon(new ImageIcon(imageio2));
        bNext.setVisible(false);
        bRestart.setVisible(false);
        word.setVisible(false);
        domaine.setVisible(false);
        p4.setVisible(false);
        gif4Label.setVisible(true);
        gifLabel.setVisible(false);
        p2.setVisible(true);

        bStart.setVisible(true);
        p1.setVisible(false);
        bA.setVisible(false);
        bB.setVisible(false);
        bC.setVisible(false);
        bD.setVisible(false);
        bE.setVisible(false);
        bF.setVisible(false);
        bG.setVisible(false);
        bH.setVisible(false);
        bI.setVisible(false);
        bJ.setVisible(false);
        bK.setVisible(false);
        bL.setVisible(false);
        bM.setVisible(false);
        bN.setVisible(false);
        bO.setVisible(false);
        bP.setVisible(false);
        bQ.setVisible(false);
        bR.setVisible(false);
        bS.setVisible(false);
        bT.setVisible(false);
        bU.setVisible(false);
        bV.setVisible(false);
        bW.setVisible(false);
        bX.setVisible(false);
        bY.setVisible(false);
        bZ.setVisible(false);
        bDeconnect.setVisible(false);
    }


    public static String wordUpdate(String word,String newword,String car) throws IOException {

        int l=word.length();
        String[] newwordArray = newword.split("");

        ArrayList<Integer> indices= new ArrayList<>();
        indices=T.getAllIndices(word,car.toUpperCase());
        for(int i=0;i<indices.size();i++){
            newwordArray[indices.get(i)*3+1]=car.toUpperCase(); //???
        }
        String ss=String.join("", newwordArray);



        if(ss.indexOf("_")==-1){




            score=score+10;


            PreparedStatement pst  ;
            ResultSet rst  ;

            String suery ="SELECT score FROM user.users WHERE email= 'admin'";

            try {

                pst = MysqlCon.getConnection().prepareStatement(suery);

                rst = pst.executeQuery();

                while(rst.next()) {
                    bestscore=rst.getInt("score") ;
                }
            }


            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"connection with sql failes"+ex+"");
            }




          if (score > bestscore){
            bestscoreLabel.setText(String.valueOf(score));

          PreparedStatement ps  ;
              ResultSet rs  ;

              String query ="UPDATE  user.users  SET score ="+score;

              try {

                  ps = MysqlCon.getConnection().prepareStatement(query);
                  ps.executeUpdate();





              }


              catch (SQLException ex) {
                  JOptionPane.showMessageDialog(null,"connection with sql failes"+ex+"");
              }

          }
            scoreLabel.setText(String.valueOf(score));
            Image imageio2 = ImageIO.read(Hangman.class.getResource("images/winner.png"));
            condamne.setIcon(new ImageIcon(imageio2));
            bRestart.setVisible(false);
            gifLabel.setVisible(false);
            gif2Label.setVisible(false);
            p4.setVisible(true);
            bNext.setVisible(true);
            bNext.setBackground(q);
            gif3Label.setVisible(true);
            p1.setVisible(false);
            bA.setVisible(false);
            bB.setVisible(false);
            bC.setVisible(false);
            bD.setVisible(false);
            bE.setVisible(false);
            bF.setVisible(false);
            bG.setVisible(false);
            bH.setVisible(false);
            bI.setVisible(false);
            bJ.setVisible(false);
            bK.setVisible(false);
            bL.setVisible(false);
            bM.setVisible(false);
            bN.setVisible(false);
            bO.setVisible(false);
            bP.setVisible(false);
            bQ.setVisible(false);
            bR.setVisible(false);
            bS.setVisible(false);
            bT.setVisible(false);
            bU.setVisible(false);
            bV.setVisible(false);
            bW.setVisible(false);
            bX.setVisible(false);
            bY.setVisible(false);
            bZ.setVisible(false);
            bDeconnect.setVisible(false);

            //start();
        }
        return ss;
    }
    public static void setToEnable() {
        gifLabel.setVisible(false) ;
        gif2Label.setVisible(true);
        gif3Label.setVisible(false);
        p3.setVisible(true);
        bRestart.setVisible(true);
        p1.setVisible(false);
        p4.setVisible(false);
        bNext.setVisible(false);
        bA.setVisible(false);
        bB.setVisible(false);
        bC.setVisible(false);
        bD.setVisible(false);
        bE.setVisible(false);
        bF.setVisible(false);
        bG.setVisible(false);
        bH.setVisible(false);
        bI.setVisible(false);
        bJ.setVisible(false);
        bK.setVisible(false);
        bL.setVisible(false);
        bM.setVisible(false);
        bN.setVisible(false);
        bO.setVisible(false);
        bP.setVisible(false);
        bQ.setVisible(false);
        bR.setVisible(false);
        bS.setVisible(false);
        bT.setVisible(false);
        bU.setVisible(false);
        bV.setVisible(false);
        bW.setVisible(false);
        bX.setVisible(false);
        bY.setVisible(false);
        bZ.setVisible(false);
        bDeconnect.setVisible(false);

        //p1.setVisible(false);
        //p2.setVisible(true);
    }

    public static JButton  buttonUpdate(JButton b){

        b.setEnabled(true);
        b.setVisible(true);
        b.setBackground(q);
        return b;
    }
    public static void suivant() throws IOException {
        gifLabel.setVisible(true) ;
        gif3Label.setVisible(false);
        gif4Label.setVisible(false);
        p4.setVisible(false);

        p2.setVisible(false);
        p1.setVisible(true);
        p1.setBackground(y);
        p3.setVisible(false);
        bNext.setVisible(false);
        incorrects=1;
        Image imageio2 = ImageIO.read(Hangman.class.getResource("images/h1.png"));
        condamne.setIcon(new ImageIcon(imageio2));

        vie=8;
        vielbl.setText(String.valueOf(vie));
        int i=T.getWord();
        if(i==-1){
            fin();
        }else {
            ourword = words[i].toUpperCase();
            ourdomaine = domains[i].toUpperCase();
            domaine.setText(ourdomaine);
            reponse = T.initialiseWord(ourword);
            word.setText(reponse);


            bA = buttonUpdate(bA);
            bB = buttonUpdate(bB);
            bC = buttonUpdate(bC);
            bD = buttonUpdate(bD);
            bE = buttonUpdate(bE);
            bF = buttonUpdate(bF);
            bG = buttonUpdate(bG);
            bH = buttonUpdate(bH);
            bI = buttonUpdate(bI);
            bJ = buttonUpdate(bJ);
            bK = buttonUpdate(bK);
            bL = buttonUpdate(bL);
            bM = buttonUpdate(bM);
            bN = buttonUpdate(bN);
            bO = buttonUpdate(bO);
            bP = buttonUpdate(bP);
            bQ = buttonUpdate(bQ);
            bR = buttonUpdate(bR);
            bS = buttonUpdate(bS);
            bT = buttonUpdate(bT);
            bU = buttonUpdate(bU);
            bV = buttonUpdate(bV);
            bW = buttonUpdate(bW);
            bX = buttonUpdate(bX);
            bY = buttonUpdate(bY);
            bZ = buttonUpdate(bZ);
            bDeconnect=buttonUpdate(bDeconnect);
            bDeconnect.setBackground(q);
        }

    }
    //////
    public static void create()throws  IOException{
        gif4Label.setVisible(false);
        gifLabel.setVisible(true);
        gif3Label.setVisible(false);
        bA.setVisible(false);
        bB.setVisible(false);
        bC.setVisible(false);
        bD.setVisible(false);
        bE.setVisible(false);
        bF.setVisible(false);
        bG.setVisible(false);
        bH.setVisible(false);
        bI.setVisible(false);
        bJ.setVisible(false);
        bK.setVisible(false);
        bL.setVisible(false);
        bM.setVisible(false);
        bN.setVisible(false);
        bO.setVisible(false);
        bP.setVisible(false);
        bQ.setVisible(false);
        bR.setVisible(false);
        bS.setVisible(false);
        bT.setVisible(false);
        bU.setVisible(false);
        bV.setVisible(false);
        bW.setVisible(false);
        bX.setVisible(false);
        bY.setVisible(false);
        bZ.setVisible(false);
        pCreate.setVisible(true);
        pCreate.setBackground(y);
        pLogin.setVisible(false);
        p2.setVisible(false);
        p1.setVisible(false);
        bNext.setVisible(false);
        p3.setVisible(false);

        word.setVisible(false);
        domaine.setVisible(false);
        gifLabel.setVisible(true) ;
        gifLabel.setVisible(true) ;
        gif3Label.setVisible(false);

    }

    public static void start() throws IOException {
        gifLabel.setVisible(true) ;
        gif4Label.setVisible(false);
        gif3Label.setVisible(false);
        bA.setVisible(true);
        bB.setVisible(true);
        bC.setVisible(true);
        bD.setVisible(true);
        bE.setVisible(true);
        bF.setVisible(true);
        bG.setVisible(true);
        bH.setVisible(true);
        bI.setVisible(true);
        bJ.setVisible(true);
        bK.setVisible(true);
        bL.setVisible(true);
        bM.setVisible(true);
        bN.setVisible(true);
        bO.setVisible(true);
        bP.setVisible(true);
        bQ.setVisible(true);
        bR.setVisible(true);
        bS.setVisible(true);
        bT.setVisible(true);
        bU.setVisible(true);
        bV.setVisible(true);
        bW.setVisible(true);
        bX.setVisible(true);
        bY.setVisible(true);
        bZ.setVisible(true);
        pCreate.setVisible(false);
        pLogin.setVisible(false);
        p2.setVisible(false);
        p1.setVisible(true);
        p1.setBackground(y);
        bNext.setVisible(false);
        p3.setVisible(false);

        word.setVisible(true);
        domaine.setVisible(true);


        score=0;
        vie=8;

        scoreLabel.setText(String.valueOf(score));
        vielbl.setText(String.valueOf(vie));

        PreparedStatement ps  ;
        ResultSet rs  ;

        String query ="SELECT score FROM user.users WHERE email= 'admin'";

        try {

            ps = MysqlCon.getConnection().prepareStatement(query);

            rs = ps.executeQuery();

 while(rs.next()) {
     bestscoreLabel.setText(String.valueOf(rs.getInt("score")));
 }
        }


        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"connection with sql failes"+ex+"");
        }


        incorrects=1;
        Image imageio2 = ImageIO.read(Hangman.class.getResource("images/h1.png"));
        condamne.setIcon(new ImageIcon(imageio2));

        indicesWords=new ArrayList<>();
        int i=T.getWord();
        if(i==-1){
            fin();
        }else {
            ourword = words[i].toUpperCase();
            ourdomaine = domains[i].toUpperCase();
            domaine.setText(ourdomaine);
            reponse = T.initialiseWord(ourword);
            word.setText(reponse);


            bA = buttonUpdate(bA);
            bB = buttonUpdate(bB);
            bC = buttonUpdate(bC);
            bD = buttonUpdate(bD);
            bE = buttonUpdate(bE);
            bF = buttonUpdate(bF);
            bG = buttonUpdate(bG);
            bH = buttonUpdate(bH);
            bI = buttonUpdate(bI);
            bJ = buttonUpdate(bJ);
            bK = buttonUpdate(bK);
            bL = buttonUpdate(bL);
            bM = buttonUpdate(bM);
            bN = buttonUpdate(bN);
            bO = buttonUpdate(bO);
            bP = buttonUpdate(bP);
            bQ = buttonUpdate(bQ);
            bR = buttonUpdate(bR);
            bS = buttonUpdate(bS);
            bT = buttonUpdate(bT);
            bU = buttonUpdate(bU);
            bV = buttonUpdate(bV);
            bW = buttonUpdate(bW);
            bX = buttonUpdate(bX);
            bY = buttonUpdate(bY);
            bZ = buttonUpdate(bZ);
            bDeconnect=buttonUpdate(bDeconnect);
            bDeconnect.setBackground(q);
        }

    }
    public static void incorrect() throws IOException {
        incorrects=incorrects+ 1;
        vie=vie-1;

        if(incorrects>8){
            Image imageio2 = ImageIO.read(Hangman.class.getResource("images/gameover.gif"));
            condamne.setIcon(new ImageIcon(imageio2));
            word.setText(T.initialiseWord(ourword));
            score=0;
            scoreLabel.setText(String.valueOf(score));
            setToEnable();
        }else {
            Image imageio2 = ImageIO.read(Hangman.class.getResource("images/h" + incorrects + ".png"));
            condamne.setIcon(new ImageIcon(imageio2));
            vielbl.setText(String.valueOf(vie));
        }
    }


    private static void deconnect() {
        gif4Label.setVisible(false);
        pLogin.setVisible(true);
        gifLabel.setVisible(true) ;
        gif3Label.setVisible(false);

        pLogin.setBackground(y);
        textPassword.setText("");
        textUsername.setText("");
        pCreate.setVisible(false);
        p1.setVisible(false);
        p2.setVisible(false);
        p4.setVisible(false);
    }

 /////////////////
    private static boolean check(){

        return (textUsername.getText().equals("")||textPassword.getText().equals(""));
    }
    private static boolean checkC(){

        return (novUsername.getText().equals("")||novEmail.getText().equals("") ||novPassword.getText().equals("")
                ||confPassword.getText().equals(""));
    }


   private static boolean checkP(String p1, String P2) {
       return Objects.equals(p1,P2);
}

    ////////////////////////////////////////

    public static void main(String[] args) throws IOException {


        System.out.println("reponse ===>"+reponse);
        final int[] score = {0};
        final int [] vie = {8};
        int bestscore=10;
        /////////////
        int xlettre=120;
        int ylettre=320;
        int w=50;
        int h=50;
        int espace= 51;
        int fw=610;
        int fh=610;





        ///////// caractere ///////////
        JLabel backg = new JLabel(); //JLabel Creation
        Image imageio1 = ImageIO.read(Hangman.class.getResource("images/background.png"));
        backg.setIcon(new ImageIcon(imageio1));
        backg.setBounds(210, 30, 250,250);
        backg.setVisible(true);


        //JLabel Creation
        Image imageio2 = ImageIO.read(Hangman.class.getResource("images/h1.png"));
        condamne.setIcon(new ImageIcon(imageio2));
        condamne.setBounds(210, 30, 250,250);
        condamne.setVisible(true);
        //////////////////////////////




        int fontb=16;
        bStart.setFont(new Font("Arial", Font.BOLD, fontb));
        bRestart.setFont(new Font("Arial", Font.BOLD, fontb));
        bNext.setFont(new Font("Arial", Font.BOLD, fontb));
        bA.setFont(new Font("Arial", Font.BOLD, fontb));
        bB.setFont(new Font("Arial", Font.BOLD, fontb));
        bC.setFont(new Font("Arial", Font.BOLD, fontb));
        bD.setFont(new Font("Arial", Font.BOLD, fontb));
        bE.setFont(new Font("Arial", Font.BOLD, fontb));
        bF.setFont(new Font("Arial", Font.BOLD, fontb));
        bG.setFont(new Font("Arial", Font.BOLD, fontb));
        bH.setFont(new Font("Arial", Font.BOLD, fontb));
        bI.setFont(new Font("Arial", Font.BOLD, fontb));
        bJ.setFont(new Font("Arial", Font.BOLD, fontb));
        bK.setFont(new Font("Arial", Font.BOLD, fontb));
        bL.setFont(new Font("Arial", Font.BOLD, fontb));
        bM.setFont(new Font("Arial", Font.BOLD, fontb));
        bN.setFont(new Font("Arial", Font.BOLD, fontb));
        bO.setFont(new Font("Arial", Font.BOLD, fontb));
        bP.setFont(new Font("Arial", Font.BOLD, fontb));
        bQ.setFont(new Font("Arial", Font.BOLD, fontb));
        bR.setFont(new Font("Arial", Font.BOLD, fontb));
        bS.setFont(new Font("Arial", Font.BOLD, fontb));
        bT.setFont(new Font("Arial", Font.BOLD, fontb));
        bU.setFont(new Font("Arial", Font.BOLD, fontb));
        bV.setFont(new Font("Arial", Font.BOLD, fontb));
        bW.setFont(new Font("Arial", Font.BOLD, fontb));
        bX.setFont(new Font("Arial", Font.BOLD, fontb));
        bY.setFont(new Font("Arial", Font.BOLD, fontb));
        bZ.setFont(new Font("Arial", Font.BOLD, fontb));
        bDeconnect.setFont(new Font("Arial", Font.BOLD, fontb));
        bDeconnect.setBackground(q);


//  labels
        word.setFont(new Font("Serif", Font.BOLD, 20));
        domaine.setFont(new Font("Serif", Font.BOLD, 20));
        word.setBounds(100,ylettre-50,200, h);
        word.setForeground(Color.gray);
        domaine.setBounds(100,ylettre-90,200, h);
        domaine.setForeground(Color.gray);
        vietxt.setFont(new Font("Serif", Font.BOLD, 18));
        vietxt.setBounds(40,3,200, h);
        vietxt.setForeground(Color.gray);
        scoreText.setFont(new Font("Serif", Font.BOLD, 18));
        scoreText.setBounds(400,3,200, h);


        bestscoreText.setFont(new Font("Serif", Font.BOLD, 18));
        scoreText.setForeground(Color.gray);
        bestscoreText.setBounds(400,40,300, h);
        bestscoreText.setForeground(Color.gray);
        scoreLabel.setFont(new Font("Serif", Font.BOLD, 18));
        scoreLabel.setBounds(530,3,200, h);
        scoreLabel.setForeground(O);
        bestscoreLabel.setFont(new Font("Serif", Font.BOLD, 18));
        bestscoreLabel.setBounds(530,40,300, h);
        bestscoreLabel.setForeground(O);
        vielbl.setFont(new Font("Serif", Font.BOLD, 18));
        vielbl.setBounds(190,3,200, h);
        vielbl.setForeground(O);

//Restart
        bStart.setBounds(400,490,w+100, h);//x axis, y axis, width, height
        bRestart.setBounds(450,500,w+50, h);//x axis, y axis, width, height
        bNext.setBounds(480,409,w+50, h);//x axis, y axis, width, height
// line 1
        bA.setBounds(xlettre,ylettre,w, h);//x axis, y axis, width, height
        bB.setBounds(xlettre+espace*1,ylettre,w, h);//x axis, y axis, width, height
        bC.setBounds(xlettre+espace*2,ylettre,w, h);//x axis, y axis, width, height
        bD.setBounds(xlettre+espace*3,ylettre,w, h);//x axis, y axis, width, height
        bE.setBounds(xlettre+espace*4,ylettre,w, h);//x axis, y axis, width, height
        bF.setBounds(xlettre+espace*5,ylettre,w, h);//x axis, y axis, width, height
        bG.setBounds(xlettre+espace*6,ylettre,w, h);//x axis, y axis, width, height
// line 2
        bH.setBounds(xlettre,ylettre+espace,w, h);//x axis, y axis, width, height
        bI.setBounds(xlettre+espace*1,ylettre+espace,w, h);//x axis, y axis, width, height
        bJ.setBounds(xlettre+espace*2,ylettre+espace,w, h);//x axis, y axis, width, height
        bK.setBounds(xlettre+espace*3,ylettre+espace,w, h);//x axis, y axis, width, height
        bL.setBounds(xlettre+espace*4,ylettre+espace,w, h);//x axis, y axis, width, height
        bM.setBounds(xlettre+espace*5,ylettre+espace,w, h);//x axis, y axis, width, height
        bN.setBounds(xlettre+espace*6,ylettre+espace,w, h);//x axis, y axis, width, height
        // line 3
        bO.setBounds(xlettre,ylettre+espace*2,w, h);//x axis, y axis, width, height
        bP.setBounds(xlettre+espace*1,ylettre+espace*2,w, h);//x axis, y axis, width, height
        bQ.setBounds(xlettre+espace*2,ylettre+espace*2,w, h);//x axis, y axis, width, height
        bR.setBounds(xlettre+espace*3,ylettre+espace*2,w, h);//x axis, y axis, width, height
        bS.setBounds(xlettre+espace*4,ylettre+espace*2,w, h);//x axis, y axis, width, height
        bT.setBounds(xlettre+espace*5,ylettre+espace*2,w, h);//x axis, y axis, width, height
        bU.setBounds(xlettre+espace*6,ylettre+espace*2,w, h);//x axis, y axis, width, height
        //LINE 4
        bV.setBounds(xlettre+espace*1,ylettre+espace*3,w, h);//x axis, y axis, width, height
        bW.setBounds(xlettre+espace*2,ylettre+espace*3,w, h);//x axis, y axis, width, height
        bX.setBounds(xlettre+espace*3,ylettre+espace*3,w, h);//x axis, y axis, width, height
        bY.setBounds(xlettre+espace*4,ylettre+espace*3,w, h);//x axis, y axis, width, height
        bZ.setBounds(xlettre+espace*5,ylettre+espace*3,w, h);//x axis, y axis, width, height

        // line 5
        bDeconnect.setBounds(xlettre+espace*3-40,ylettre+espace*4,130, h);//x axis, y axis, width, height


//////////////////////////////////////////////////////
        lblUsername.setBounds(170, 140, 260, 30);
        lblUsername.setForeground(Color.pink);
        textUsername.setBounds(170, 180, 260, 30);
        lblPassword.setBounds(170, 220, 260, 30);
        lblPassword.setForeground(Color.pink);
        textPassword.setBounds(170, 260, 260, 30);
        btnSingn.setBounds(170, 350, 100, 30);
        btnCreate.setBounds(330, 350, 100, 30);
        btnClose.setBounds(250, 400, 100, 30);
        pLogin.add(gifLabel) ;
        pLogin.add(lblUsername);
        pLogin.add(textUsername);
        pLogin.add(lblPassword);
        pLogin.add(textPassword);
        pLogin.add(btnSingn);
        pLogin.add(btnCreate);
        pLogin.add(btnClose);
         ///

        lblNovUsername.setBounds(170, 100, 260, 30);
        lblNovUsername.setForeground(Color.pink);
        novUsername.setBounds(170, 130, 100, 30);
        lblEmailUsername.setBounds(170,160,260,30);
        lblEmailUsername.setForeground(Color.pink);
        novEmail.setBounds(170, 190, 260, 30);
        lblNovPassword.setBounds(170, 220, 260, 30);
        lblNovPassword.setForeground(Color.pink);
        novPassword.setBounds(170, 250, 260, 30);
        lblConfPassword.setBounds(170, 280, 260, 30);
        lblConfPassword.setForeground(Color.pink);
        confPassword.setBounds( 170 ,310,260,30 );
        btnRegistre.setBounds(240, 350, 100, 30);
        lblLog.setBounds( 210 ,390,260,30 );
        lblLog.setForeground(Color.pink);
        btnLogin.setBounds(240, 430, 100, 30);


        pCreate.add(lblNovUsername);
        pCreate.add(novUsername);
        pCreate.add(lblEmailUsername);
        pCreate.add(novEmail);
        pCreate.add(lblNovPassword);
        pCreate.add(novPassword);
        pCreate.add(lblConfPassword);
        pCreate.add(confPassword);
        pCreate.add(btnRegistre);
        pCreate.add(lblLog);
        pCreate.add(btnLogin);

        btnClose.addActionListener(new ActionListener() {
                                       @Override
                                       public void actionPerformed(ActionEvent e) {
                                           f.dispose();
                                       }
        }
        );
        ////
        btnCreate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    create();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        } );
      ///

        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deconnect();
            }
        } );

        btnRegistre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkC()){
                    JOptionPane.showMessageDialog(null,"Assurez-vous d'entrer toutes les informations","données manquantes", JOptionPane.ERROR_MESSAGE);
                }

                else {

                    String username = novUsername.getText();
                    String email = novEmail.getText();
                    String password = String.valueOf(novPassword.getText());
                    String cPassword =String.valueOf(confPassword.getText());

                    if( !checkP(password,cPassword)){

                   JOptionPane.showMessageDialog(null,"le mot de passe ne correspond pas", "password! ", JOptionPane.ERROR_MESSAGE);

                    }

                    else {

            SHA256  l = new SHA256();
                        try {

                            password = l.toHexString(l.getSHA(password));
                        } catch (NoSuchAlgorithmException ex) {
                            throw new RuntimeException(ex);
                        }

                        PreparedStatement ps ;

                        String query ="INSERT INTO user.users(email,password,username,score) values(?,?,?,?) ";


                            try {

                                ps = MysqlCon.getConnection().prepareStatement(query);
                                ps.setString(1,email);
                                ps.setString(2,password);
                                ps.setString(3,username);
                                ps.setString(4, String.valueOf(bestscore));
                             if(ps.executeUpdate()!=0){
        JOptionPane.showMessageDialog(null,"vous avez créer un copmte", "Succès! ", JOptionPane.PLAIN_MESSAGE);

                             }
                           else{
          JOptionPane.showMessageDialog(null,"vous n avez pas créer un copmte", "Error! ", JOptionPane.ERROR_MESSAGE);
                             }

                            } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"connection with sql failes"+ex+"");                            }


                    }


                }



                }

        }

        );










        btnSingn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {


                if (check()){
                    JOptionPane.showMessageDialog(null,"enter your email and password", "missing infor ", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    PreparedStatement ps  ;
                    ResultSet rs  ;
                    String username = textUsername.getText();
                    String password = textPassword.getText();
                    SHA256  l = new SHA256();
                    try {

                        password = l.toHexString(l.getSHA(password));
                    } catch (NoSuchAlgorithmException ex) {
                        throw new RuntimeException(ex);
                    }
                    String query ="SELECT *FROM user.users WHERE email=? AND password =? ";


                    try {

                        ps = MysqlCon.getConnection().prepareStatement(query);
                        ps.setString(1,username);
                        ps.setString(2,password);
                        rs = ps.executeQuery();


                        if (rs.next()){
                            try {
                              start();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }
                        else{
                          JOptionPane.showMessageDialog(null, "no user with this email or password", "incorrect data",JOptionPane.ERROR_MESSAGE);
                        }
                    }


                     catch (SQLException ex) {
                       JOptionPane.showMessageDialog(null,"connection with sql failes"+ex+"");
                    }


                }
            }

        });






        ////////////////////////////////////////
        p2.add(bStart);
        p3.add(bRestart);
        p4.add(bNext);

        p1.add(condamne);
        p1.add(backg);
        p1.add(domaine);
        p1.add(word);
        p1.add(scoreText);
        p1.add(bestscoreText);
        p1.add(scoreLabel);
        p1.add(bestscoreLabel);
        p1.add(vietxt);
        p1.add(vielbl);

        p1.add(bA);//adding button in JFrame
        p1.add(bB);//adding button in JFrame
        p1.add(bC);//adding button in JFrame
        p1.add(bD);//adding button in JFrame
        p1.add(bE);//adding button in JFrame
        p1.add(bF);//adding button in JFrame
        p1.add(bG);//adding button in JFrame
        p1.add(bH);//adding button in JFrame
        p1.add(bI);//adding button in JFrame
        p1.add(bJ);//adding button in JFrame
        p1.add(bK);//adding button in JFrame
        p1.add(bL);//adding button in JFrame
        p1.add(bM);//adding button in JFrame
        p1.add(bN);//adding button in JFrame
        p1.add(bO);//adding button in JFrame
        p1.add(bP);//adding button in JFrame
        p1.add(bQ);//adding button in JFrame
        p1.add(bR);//adding button in JFrame
        p1.add(bS);//adding button in JFrame
        p1.add(bT);//adding button in JFrame
        p1.add(bU);//adding button in JFrame
        p1.add(bV);//adding button in JFrame
        p1.add(bW);//adding button in JFrame
        p1.add(bX);//adding button in JFrame
        p1.add(bY);//adding button in JFrame
        p1.add(bZ);//adding button in JFrame
        p1.add(bDeconnect);
        /////////////////////////// Actions ////////////////////////////
        //bA.setEnabled(false);
        //bA.setBackground(O);

        //bB.setEnabled(false);
        //bB.setBackground(y);

        bStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              f.dispose();
            }
        } );

        bRestart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    start();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        } );
        bNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    suivant();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        } );

        bA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bA.setEnabled(false);
                if(T.LettreExist(ourword,"a")){
                    try {
                        reponse=wordUpdate(ourword,reponse,"a");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    word.setText(reponse);
                    bA.setBackground(y);
                }
                else{
                    try {
                        incorrect();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    bA.setVisible(false);
                }
            }
        } );
        bB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bB.setEnabled(false);
                if(T.LettreExist(ourword,"b")){
                    try {
                        reponse=wordUpdate(ourword,reponse,"b");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    word.setText(reponse);
                    bB.setBackground(y);
                }
                else{
                    try {
                        incorrect();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    bB.setVisible(false);
                }
            }
        } );
        bC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bC.setEnabled(false);
                if(T.LettreExist(ourword,"c")){
                    try {
                        reponse=wordUpdate(ourword,reponse,"c");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    word.setText(reponse);
                    bC.setBackground(y);
                }
                else{
                    try {
                        incorrect();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    bC.setVisible(false);
                }
            }
        } );
        bD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bD.setEnabled(false);
                if(T.LettreExist(ourword,"d")){
                    try {
                        reponse=wordUpdate(ourword,reponse,"d");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    word.setText(reponse);
                    bD.setBackground(y);
                }
                else{
                    try {
                        incorrect();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    bD.setVisible(false);
                }
            }
        } );
        bE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bE.setEnabled(false);
                if(T.LettreExist(ourword,"e")){
                    try {
                        reponse=wordUpdate(ourword,reponse,"e");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    word.setText(reponse);
                    bE.setBackground(y);
                }
                else{
                    try {
                        incorrect();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    bE.setVisible(false);
                }
            }
        } );
        bF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bF.setEnabled(false);
                String ch="f";
                if(T.LettreExist(ourword,ch)){
                    try {
                        reponse=wordUpdate(ourword,reponse,ch);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    word.setText(reponse);
                    bF.setBackground(y);
                }
                else{
                    try {
                        incorrect();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    bF.setVisible(false);
                }
            }
        } );
        bG.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bG.setEnabled(false);
                String ch="g";
                if(T.LettreExist(ourword,ch)){
                    try {
                        reponse=wordUpdate(ourword,reponse,ch);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    word.setText(reponse);
                    bG.setBackground(y);
                }
                else{
                    try {
                        incorrect();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    bG.setVisible(false);
                }
            }
        } );
        bH.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bH.setEnabled(false);
                String ch="h";
                if(T.LettreExist(ourword,ch)){
                    try {
                        reponse=wordUpdate(ourword,reponse,ch);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    word.setText(reponse);
                    bH.setBackground(y);
                }
                else{
                    try {
                        incorrect();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    bH.setVisible(false);
                }
            }
        } );
        bI.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bI.setEnabled(false);
                String ch="i";
                if(T.LettreExist(ourword,ch)){
                    try {
                        reponse=wordUpdate(ourword,reponse,ch);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    word.setText(reponse);
                    bI.setBackground(y);
                }
                else{
                    try {
                        incorrect();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    bI.setVisible(false);
                }
            }
        } );
        bJ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bJ.setEnabled(false);
                String ch="j";
                if(T.LettreExist(ourword,ch)){
                    try {
                        reponse=wordUpdate(ourword,reponse,ch);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    word.setText(reponse);
                    bJ.setBackground(y);
                }
                else{
                    try {
                        incorrect();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    bJ.setVisible(false);
                }
            }
        } );
        bK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bK.setEnabled(false);
                String ch="k";
                if(T.LettreExist(ourword,ch)){
                    try {
                        reponse=wordUpdate(ourword,reponse,ch);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    word.setText(reponse);
                    bK.setBackground(y);
                }
                else{
                    try {
                        incorrect();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    bK.setVisible(false);
                }
            }
        } );
        bL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bL.setEnabled(false);
                String ch="l";
                if(T.LettreExist(ourword,ch)){
                    try {
                        reponse=wordUpdate(ourword,reponse,ch);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    word.setText(reponse);
                    bL.setBackground(y);
                }
                else{
                    try {
                        incorrect();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    bL.setVisible(false);
                }
            }
        } );
        bM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bM.setEnabled(false);
                String ch="m";
                if(T.LettreExist(ourword,ch)){
                    try {
                        reponse=wordUpdate(ourword,reponse,ch);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    word.setText(reponse);
                    bM.setBackground(y);
                }
                else{
                    try {
                        incorrect();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    bM.setVisible(false);
                }
            }
        } );
        bN.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bN.setEnabled(false);
                String ch="n";
                if(T.LettreExist(ourword,ch)){
                    try {
                        reponse=wordUpdate(ourword,reponse,ch);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    word.setText(reponse);
                    bN.setBackground(y);
                }
                else{
                    try {
                        incorrect();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    bN.setVisible(false);
                }
            }
        } );
        bO.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bO.setEnabled(false);
                String ch="o";
                if(T.LettreExist(ourword,ch)){
                    try {
                        reponse=wordUpdate(ourword,reponse,ch);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    word.setText(reponse);
                    bO.setBackground(y);
                }
                else{
                    try {
                        incorrect();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    bO.setVisible(false);
                }
            }
        } );
        bP.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bP.setEnabled(false);
                String ch="p";
                if(T.LettreExist(ourword,ch)){
                    try {
                        reponse=wordUpdate(ourword,reponse,ch);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    word.setText(reponse);
                    bP.setBackground(y);
                }
                else{
                    try {
                        incorrect();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    bP.setVisible(false);
                }
            }
        } );
        bQ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bQ.setEnabled(false);
                String ch="q";
                if(T.LettreExist(ourword,ch)){
                    try {
                        reponse=wordUpdate(ourword,reponse,ch);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    word.setText(reponse);
                    bQ.setBackground(y);
                }
                else{
                    try {
                        incorrect();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    bQ.setVisible(false);
                }
            }
        } );
        bR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bR.setEnabled(false);
                String ch="r";
                if(T.LettreExist(ourword,ch)){
                    try {
                        reponse=wordUpdate(ourword,reponse,ch);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    word.setText(reponse);
                    bR.setBackground(y);
                }
                else{
                    try {
                        incorrect();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    bR.setVisible(false);
                }
            }
        } );
        bS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bS.setEnabled(false);
                String ch="s";
                if(T.LettreExist(ourword,ch)){
                    try {
                        reponse=wordUpdate(ourword,reponse,ch);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    word.setText(reponse);
                    bS.setBackground(y);
                }
                else{
                    try {
                        incorrect();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    bS.setVisible(false);
                }
            }
        } );
        bT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bT.setEnabled(false);
                String ch="t";
                if(T.LettreExist(ourword,ch)){
                    try {
                        reponse=wordUpdate(ourword,reponse,ch);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    word.setText(reponse);
                    bT.setBackground(y);
                }
                else{
                    try {
                        incorrect();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    bT.setVisible(false);
                }
            }
        } );
        bU.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bU.setEnabled(false);
                String ch="u";
                if(T.LettreExist(ourword,ch)){
                    try {
                        reponse=wordUpdate(ourword,reponse,ch);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    word.setText(reponse);
                    bU.setBackground(y);
                }
                else{
                    try {
                        incorrect();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    bU.setVisible(false);
                }
            }
        } );
        bV.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bV.setEnabled(false);
                String ch="v";
                if(T.LettreExist(ourword,ch)){
                    try {
                        reponse=wordUpdate(ourword,reponse,ch);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    word.setText(reponse);
                    bV.setBackground(y);
                }
                else{
                    try {
                        incorrect();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    bV.setVisible(false);
                }
            }
        } );
        bW.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bW.setEnabled(false);
                String ch="w";
                if(T.LettreExist(ourword,ch)){
                    try {
                        reponse=wordUpdate(ourword,reponse,ch);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    word.setText(reponse);
                    bW.setBackground(y);
                }
                else{
                    try {
                        incorrect();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    bW.setVisible(false);
                }
            }
        } );
        bX.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bX.setEnabled(false);
                String ch="x";
                if(T.LettreExist(ourword,ch)){
                    try {
                        reponse=wordUpdate(ourword,reponse,ch);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    word.setText(reponse);
                    bX.setBackground(y);
                }
                else{
                    try {
                        incorrect();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    bX.setVisible(false);
                }
            }
        } );
        bY.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bY.setEnabled(false);
                String ch="y";
                if(T.LettreExist(ourword,ch)){
                    try {
                        reponse=wordUpdate(ourword,reponse,ch);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    word.setText(reponse);
                    bY.setBackground(y);
                }
                else{
                    try {
                        incorrect();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    bY.setVisible(false);
                }
            }
        } );
        bZ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bZ.setEnabled(false);
                String ch="z";
                if(T.LettreExist(ourword,ch)){
                    try {
                        reponse=wordUpdate(ourword,reponse,ch);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    word.setText(reponse);
                    bZ.setBackground(y);
                }
                else{
                    try {
                        incorrect();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    bZ.setVisible(false);
                }
            }
        } );

        bDeconnect.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deconnect();
            }
        } );



        /////////////////////////////////////////////////////////

        f.add(pLogin);
        f.add(p1);
        f.add(p2);
        f.add(p3);
        f.add(p4);
        f.add(pCreate);
        pLogin.setVisible(true);//making the frame visible
       pLogin.setBackground(y);
        p1.setVisible(false);//making the frame visible
        p2.setVisible(false);//making the frame visible
        p3.setVisible(false);
        p4.setVisible(false);
        pCreate.setVisible(false);

        pLogin.setSize(fw,fh);//400 width and 500 height
        pLogin.setLayout(null);//using no layout managers

        pCreate.setSize(fw,fh);//400 width and 500 height
        pCreate.setLayout(null);//using no layout managers

        p1.setSize(fw,fh);//400 width and 500 height
        p1.setLayout(null);//using no layout managers


        p2.setSize(fw,fh);//400 width and 500 height
        p2.setLayout(null);//using no layout managers
        p4.setSize(fw,fh);//400 width and 500 height
        p4.setLayout(null);//using no layout managers
        p3.setSize(fw,fh);//400 width and 500 height
        p3.setLayout(null);//using no layout managers
        f.setSize(fw,fh);//400 width and 500 height

        f.setLayout(null);//using no layout managers
        f.setLocationRelativeTo(null);
        f.setVisible(true);//making the frame visible


    }


}  