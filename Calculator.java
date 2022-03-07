import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.constant.ConstantDesc;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.text.AttributeSet.ColorAttribute;


public class Calculator implements ActionListener{
	JFrame jf;
	JLabel displayLabel;
	
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton sixButton;
	JButton fiveButton;
	JButton fourButton;
	JButton threeButton;
	JButton twoButton;
	JButton oneButton;
	JButton divButton;
	JButton mulButton;
	JButton plusButton;
	JButton minusButton;
	JButton dottButton;
	JButton zeroButton;
	JButton clearButton;
	JButton equalButton;
	int operatorClicked=0;
	String newValue;
	String oldValue;
	float result;
	
	
	
	Calculator(){
			 jf=new JFrame("calculator");
			jf.setLayout(null);
			jf.setSize(600, 600);
			jf.setLocation(1300, 100);
			
			 displayLabel=new JLabel();
			displayLabel.setBounds(30, 30, 540, 40);
			displayLabel.setBackground(Color.gray);
			displayLabel.setOpaque(true); //color show//
			displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);//text right sidil print cheyyanaaayi//
			displayLabel.setForeground(Color.white);
			jf.add(displayLabel);
			
			 sevenButton=new JButton("7");
			sevenButton.setBounds(30, 90, 100, 80);
			
			sevenButton.setFont(new Font("Arial",Font.PLAIN,30));
			sevenButton.addActionListener(this);
			jf.add(sevenButton);
			
			 eightButton=new JButton("8");
			eightButton.setBounds(155, 90, 100, 80);
			eightButton.setFont(new Font("Arial",Font.PLAIN,30));
			eightButton.addActionListener(this);
			jf.add(eightButton);
			
			nineButton=new JButton("9");
			nineButton.setBounds(280, 90, 100, 80);
			nineButton.setFont(new Font("Arial",Font.PLAIN,30));
			nineButton.addActionListener(this);
			jf.add(nineButton);
			divButton=new JButton("/");
			divButton.setBounds(405, 90, 100, 80);
			divButton.setFont(new Font("Arial",Font.PLAIN,30));
			divButton.addActionListener(this);
			jf.add(divButton);
		    
			
			
			
			 fourButton=new JButton("4");
			fourButton.setBounds(30, 190, 100, 80);
			fourButton.setFont(new Font("Arial",Font.PLAIN,30));
			fourButton.addActionListener(this);
			jf.add(fourButton);
			
			 fiveButton=new JButton("5");
			fiveButton.setBounds(155, 190, 100, 80);
			fiveButton.setFont(new Font("Arial",Font.PLAIN,30));
			fiveButton.addActionListener(this);
			jf.add(fiveButton);
			
			 sixButton=new JButton("6");
			sixButton.setBounds(280, 190, 100, 80);
			sixButton.setFont(new Font("Arial",Font.PLAIN,30));
			sixButton.addActionListener(this);
			jf.add(sixButton);
			
			 mulButton=new JButton("X");
			mulButton.setBounds(405, 190, 100, 80);
			mulButton.setFont(new Font("Arial",Font.PLAIN,30));
			mulButton.addActionListener(this);
			jf.add(mulButton);
			
			
			
			
			 threeButton=new JButton("3");
			threeButton.setBounds(280, 290, 100, 80);
			threeButton.setFont(new Font("Arial",Font.PLAIN,30));
			threeButton.addActionListener(this);
			jf.add(threeButton);
			
			 twoButton=new JButton("2");
			twoButton.setBounds(155, 290, 100, 80);			
			twoButton.setFont(new Font("Arial",Font.PLAIN,30));
			twoButton.addActionListener(this);
			jf.add(twoButton);
			
			 oneButton=new JButton("1");
			oneButton.setBounds(30, 290, 100, 80);
			oneButton.setFont(new Font("Arial",Font.PLAIN,30));
			oneButton.addActionListener(this);
			jf.add(oneButton);
			
			 minusButton=new JButton("-");
			minusButton.setBounds(405, 290, 100, 80);
			minusButton.setFont(new Font("Arial",Font.PLAIN,30));
			minusButton.addActionListener(this);
			jf.add(minusButton);
		
			
			
			 zeroButton=new JButton("0");
			zeroButton.setBounds(30, 390, 100, 80);
			zeroButton.setFont(new Font("Arial",Font.PLAIN,30));
			zeroButton.addActionListener(this);
			jf.add(zeroButton);
			
			 dottButton=new JButton(".");
			dottButton.setBounds(155, 390, 100, 80);
			dottButton.setFont(new Font("Arial",Font.PLAIN,30));
			dottButton.addActionListener(this);
			jf.add(dottButton);
			
			 equalButton=new JButton("=");
			equalButton.setBounds(280, 390, 100, 80);
			equalButton.setFont(new Font("Arial",Font.PLAIN,30));
			equalButton.addActionListener(this);
			jf.add(equalButton);
			
			 plusButton=new JButton("+");
			plusButton.setBounds(405, 390, 100, 80);
			plusButton.setFont(new Font("Arial",Font.PLAIN,30));
			plusButton.addActionListener(this);
			jf.add(plusButton);
		
			
			 clearButton=new JButton("C");
			clearButton.setBounds(405, 490, 130, 50);
			clearButton.setFont(new Font("Arial",Font.PLAIN,30));
			clearButton.addActionListener(this);
			jf.add(clearButton);
			
			
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //automatic close the program by exit button//
		
	}
	
	
	public static void main(String[] args) {
		new  Calculator(); //we can also make Calculator object here like calculator cl=new calc() but here we do not need a object thats why object is not create//
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenButton) {
			
				displayLabel.setText(displayLabel.getText()+ "7");
			
		
		}else if(e.getSource()==eightButton){
			
				displayLabel.setText(displayLabel.getText()+"8");
		
			
		}else if(e.getSource()==nineButton){
			
				displayLabel.setText(displayLabel.getText()+"9");
		
			
		}else if(e.getSource()==fourButton){
		
			displayLabel.setText(displayLabel.getText()+"4");
		
		}else if(e.getSource()==fiveButton){
			
				displayLabel.setText(displayLabel.getText()+"5");
			}else if(e.getSource()==sixButton){
			
				displayLabel.setText(displayLabel.getText()+"6");
			
		}else if(e.getSource()==threeButton){
			
				displayLabel.setText(displayLabel.getText()+"3");
			
		}else if(e.getSource()==twoButton){
			
				displayLabel.setText(displayLabel.getText()+"2");
			
		}else if(e.getSource()==oneButton){
			
				displayLabel.setText(displayLabel.getText()+"1");
			
		}else if(e.getSource()==zeroButton){
			
				displayLabel.setText(displayLabel.getText()+"0");
				
			
		}else if(e.getSource()==dottButton){
			
				displayLabel.setText(displayLabel.getText()+".");
			
		}else if(e.getSource()==clearButton){
			displayLabel.setText(" "); //screen clear aavanaayi "" ounnum kodukkunnilla
		}else if(e.getSource()==plusButton){
			oldValue=displayLabel.getText();
			operatorClicked=1;
			displayLabel.setText("");
			
			
		}else if(e.getSource()==divButton){
			oldValue=displayLabel.getText();
			operatorClicked=2;
			displayLabel.setText("");
			
		}else if(e.getSource()==mulButton){
			oldValue=displayLabel.getText();
			operatorClicked=3;
			displayLabel.setText("");
		}else if(e.getSource()==minusButton){
			oldValue=displayLabel.getText();
			operatorClicked=4;
			displayLabel.setText("");
		}else if(e.getSource()==equalButton){
			newValue=displayLabel.getText();		
			float newValueF=Float.parseFloat(newValue);
			float oldValueF=Float.parseFloat(oldValue);
			
			switch (operatorClicked) {
			case 1:result=oldValueF+newValueF;
			break;
			case 2:result=oldValueF/newValueF;
			break;
			case 3:result=oldValueF*newValueF;
			break;
			case 4:result=oldValueF-newValueF;
			break;
			default:result=0;
			
			}
			
			displayLabel.setText(result+"");
			
		}
		
		
	}

}
