import javax.swing.*; //sirve para importar los elementos para armar los botones
import java.awt.event.*; //sirve para controlar los eventos de los elementos contenidos en la interfaz
import java.awt.*;

public class CalculadoraTrab extends JFrame implements ActionListener{
       private JButton boton1, boton2, boton3, boton4, boton5, 
                      boton6, boton7, boton8, boton9, boton10, 
                      boton11, boton12, boton13, boton14, boton15, 
                      boton16, boton17;
       private JTextField textfield1;
       public float primerDato, segundoDato;
       public String operador;
       public CalculadoraTrab(){
              setTitle("Calculadora");
              setLayout(null);
              setResizable(false);
              setLocationRelativeTo(null);
              setBounds(0,0,310,400);//dimensiones a mi ventana
              setLocationRelativeTo(null); //sirve para centrar mi ventana
              setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              textfield1 = new JTextField();
              textfield1.setBounds(10,10,205,35);
              textfield1.setEditable(false); //no nos permite escribir en
              //textfield1.setEnabled(false); //no nos permite escribir en
              add(textfield1);
//teclado de números
              boton1 = new JButton("1");
              boton1.setBounds(10,70,60,60);
              boton1.setFont(new Font("Times New Roman", Font.BOLD,16));
              boton1.addActionListener(this);
              boton1.setBackground(new Color(231, 76, 60));
              add(boton1);
          
              boton2 = new JButton("2");
              boton2.setBounds(83,70,60,60);
              boton2.setFont(new Font("Times New Roman", Font.BOLD,16));
              boton2.addActionListener(this);
              boton2.setBackground(new Color(231, 76, 60));
              boton2.setForeground(Color.white);
              add(boton2);
         
              boton3 = new JButton("3");
              boton3.setBounds(153,70,60,60);
              boton3.setFont(new Font("Times New Roman", Font.BOLD,16));
              boton3.addActionListener(this);
              boton3.setBackground(new Color(231, 76, 60));
              add(boton3);
        
              boton4 = new JButton("4");
              boton4.setBounds(10,140,60,60);
              boton4.setFont(new Font("Times New Roman", Font.BOLD,16));
              boton4.addActionListener(this);
              boton4.setBackground(new Color(231, 76, 60));
              boton4.setForeground(Color.white);
              add(boton4);

              boton5 = new JButton("5");
              boton5.setBounds(83,140,60,60);
              boton5.setFont(new Font("Times New Roman", Font.BOLD,16));
              boton5.addActionListener(this);
              boton5.setBackground(new Color(231, 76, 60));
              add(boton5);

              boton6 = new JButton("6");
              boton6.setBounds(153,140,60,60);
              boton6.setFont(new Font("Times New Roman", Font.BOLD,16));
              boton6.addActionListener(this);
              boton6.setBackground(new Color(231, 76, 60));
              boton6.setForeground(Color.white);
              add(boton6);

              boton7 = new JButton("7");
              boton7.setBounds(10,210,60,60);
              boton7.setFont(new Font("Times New Roman", Font.BOLD,16));
              boton7.addActionListener(this);
              boton7.setBackground(new Color(231, 76, 60));
              add(boton7);

              boton8 = new JButton("8");
              boton8.setBounds(83,210,60,60);
              boton8.setFont(new Font("Times New Roman", Font.BOLD,16));
              boton8.addActionListener(this);
              boton8.setBackground(new Color(231, 76, 60));
              boton8.setForeground(Color.white);
              add(boton8);

              boton9 = new JButton("9");
              boton9.setBounds(153,210,60,60);
              boton9.setFont(new Font("Times New Roman", Font.BOLD,16));
              boton9.addActionListener(this);
              boton9.setBackground(new Color(231, 76, 60));
              add(boton9);

              boton10 = new JButton(".");
              boton10.setBounds(10,280,60,60);
              boton10.setFont(new Font("Times New Roman", Font.BOLD,16));
              boton10.addActionListener(this);
              boton10.setForeground(Color.white);
              boton10.setBackground(new Color(231, 76, 60));
              add(boton10);

              boton11 = new JButton("0");
              boton11.setBounds(83,280,60,60);
              boton11.setFont(new Font("Times New Roman", Font.BOLD,16));
              boton11.addActionListener(this);
              boton11.setBackground(new Color(231, 76, 60));
              add(boton11);

              boton12 = new JButton("/");
              boton12.setBounds(153,280,60,60);
              boton12.setFont(new Font("Times New Roman", Font.BOLD,16));
              boton12.addActionListener(this);
              boton12.setBackground(new Color(231, 76, 60));
              boton12.setForeground(Color.white);
              add(boton12);

//laterales (operadores)
              boton13 = new JButton("+");
              boton13.setBounds(223,70,60,60);
              boton13.setFont(new Font("Times New Roman", Font.BOLD,16));
              boton13.addActionListener(this);
              boton13.setBackground(new Color(187, 143, 206));
              boton13.setForeground(Color.white);
              add(boton13);

              boton14 = new JButton("-");
              boton14.setBounds(223,140,60,60);
              boton14.setFont(new Font("Times New Roman", Font.BOLD,16));
              boton14.addActionListener(this);
              boton14.setBackground(new Color(187, 143, 206));
              add(boton14);

              boton15 = new JButton("*");
              boton15.setBounds(223,210,60,60);
              boton15.setFont(new Font("Times New Roman", Font.BOLD,16));
              boton15.addActionListener(this);
              boton15.setBackground(new Color(187, 143, 206));
              boton15.setForeground(Color.white);
              add(boton15);

              boton16 = new JButton("=");
              boton16.setBounds(223,280,60,60);
              boton16.setFont(new Font("Times New Roman", Font.BOLD,16));
              boton16.addActionListener(this);
              boton16.setBackground(new Color(187, 143, 206));
              add(boton16);

              boton17 = new JButton("CE");
              boton17.setBounds(223,10,60,50);
              boton17.setFont(new Font("Times New Roman", Font.BOLD,16));
              boton17.addActionListener(this);
              boton17.setBackground(new Color(187, 143, 206));
              add(boton17);
       } //calculadoraTrab()
       public void actionPerformed(ActionEvent e){
              if(e.getSource() == boton1){
                 textfield1.setText(textfield1.getText() + "1");
        }         
              if(e.getSource() == boton2){
                 textfield1.setText(textfield1.getText() + "2");
        }
              if(e.getSource() == boton3){
                 textfield1.setText(textfield1.getText() + "3");
        }
              if(e.getSource() == boton4){
                 textfield1.setText(textfield1.getText() + "4");
        }
              if(e.getSource() == boton5){
                 textfield1.setText(textfield1.getText() + "5");
        }
              if(e.getSource() == boton6){
                 textfield1.setText(textfield1.getText() + "6");
        }
              if(e.getSource() == boton7){
                 textfield1.setText(textfield1.getText() + "7");
        }
              if(e.getSource() == boton8){
                 textfield1.setText(textfield1.getText() + "8");
        }
              if(e.getSource() == boton9){
                 textfield1.setText(textfield1.getText() + "9");
        }
              if(e.getSource() == boton10){
                   if(!(textfield1.getText().contains("."))){
                 textfield1.setText(textfield1.getText() + ".");
              }
        }
              if(e.getSource() == boton11){
                 textfield1.setText(textfield1.getText() + "0");
        }
              if(e.getSource() == boton12){
                 primerDato = Float.parseFloat(textfield1.getText());
                 operador = "/";
                 textfield1.setText("");
        }
              if(e.getSource() == boton13){
                 primerDato = Float.parseFloat(textfield1.getText());
                 operador = "+";
                 textfield1.setText("");
        }
              if(e.getSource() == boton14){
                 primerDato = Float.parseFloat(textfield1.getText());
                 operador = "-";
                 textfield1.setText("");
        }
              if(e.getSource() == boton15){
                 primerDato = Float.parseFloat(textfield1.getText());
                 operador = "*";
                 textfield1.setText("");
        }
              if(e.getSource() == boton17){
                 textfield1.setText("");
        }     
              if(e.getSource() == boton16){
                 segundoDato = Float.parseFloat(textfield1.getText());
                 
                 switch(operador){
                   case"+" : textfield1.setText(cero(primerDato + segundoDato));
                   break;
                   case"-" : textfield1.setText(cero(primerDato - segundoDato));
                   break;
                   case"*" : textfield1.setText(cero(primerDato * segundoDato));
                   break;
                   case"/" : if(segundoDato == 0){textfield1.setText("MATH ERROR");}
                   else{
                   textfield1.setText(cero(primerDato / segundoDato));}
                   break;
            } //switch                
        } //boton16         
    } //ActionPerformed(ActionEvent e)
    public String cero(float resultado){
           String retorno = "";
           retorno = Float.toString(resultado);
            if(resultado % 1 == 0){
               retorno = retorno.substring(0,retorno.length()-2);
        }
            return retorno;
        } //String cero      
} //ActionListener