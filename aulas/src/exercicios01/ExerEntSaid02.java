	package exercicios01;
	
	import javax.swing.JOptionPane;
	
	public class ExerEntSaid02 {
	
		public static void main(String[] args) {
			
			float desconto =  0.05f;
		
	        String a = JOptionPane.showInputDialog("Insira o valor do IPTU: ");
	        
	        float valor = Float.parseFloat(a);
	        
	        float valorDesconto = (valor * desconto); 
	        
	        float valorFinal = valor - valorDesconto;
	        
	        String message = "O valor do IPTU é de R$" + valor + "\n" +
	        				 "O valor do desconto é de R$" + valorDesconto + "\n" +
	        				 "O valor final é de R$" + valorFinal;
	        
	        JOptionPane.showMessageDialog(null, message);
	        
	
	        
	        
	
		}
	
	}
