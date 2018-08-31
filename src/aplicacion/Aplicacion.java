
package aplicacion;

import java.util.Scanner;

public class Aplicacion {
    
     static int cronometro(int horas,int minutos,int segundos,int decimas,int centesimas,int milesimas){
            
        Scanner sc = new Scanner(System.in);
	int contador_horas=0,contador_minutos=0,contador_segundos=0,contador_decimas=0,contador_centesimas=0,contador_milesimas=0;
        
	System.out.print("Ingrese el tiempo que desea cronometrar\n");
        System.out.print("HORAS\n");
        horas = sc.nextInt();
        System.out.print("MINUTOS\n");
        minutos = sc.nextInt();
        System.out.print("SEGUNDOS\n");
        segundos = sc.nextInt();
        System.out.print("DECIMAS DE SEGUNDO\n");
        decimas= sc.nextInt();
        System.out.print("CENTESIMAS DE SEGUNDO\n");
        centesimas= sc.nextInt();
        System.out.print("MILESIMAS DE SEGUNDO\n");
        milesimas = sc.nextInt();
        
	
	
		for (contador_horas=0;contador_horas<24;contador_horas++)
		{
			for (contador_minutos=0;contador_minutos<60;contador_minutos++)
			{
				for (contador_segundos=0;contador_segundos<60;contador_segundos++)
				{
                                    for (contador_decimas=0;contador_decimas<10;contador_decimas++)
                                    {
                                        for (contador_centesimas=0;contador_centesimas<10;contador_centesimas++)
                                        {
                                            for (contador_milesimas=0;contador_milesimas<10;contador_milesimas++)
                                            {
                                                
                                               do
                                              {
                                                  System.out.print(contador_horas+":"+contador_minutos+":"+contador_segundos+":"+contador_decimas+":"+contador_centesimas+":"+contador_milesimas+"\n");
                                        
                                                      if((contador_horas==horas) & (contador_minutos==minutos) & (contador_segundos==segundos)&(contador_decimas==decimas) & (contador_centesimas==centesimas) & (contador_milesimas==milesimas))
                                                        {
                                                          System.exit(0);
                                                        }
                                              }  while((contador_horas==horas) & (contador_minutos==minutos) & (contador_segundos==segundos)&(contador_decimas==decimas) & (contador_centesimas==centesimas) & (contador_milesimas==milesimas));
                                           
                                            }
                                        }
                                    }
				    
				}
			}
		}
            return 0;
        }
     
     
     static int Temporizador(int horas3,int minutos3,int segundos3,int decimas3,int centesimas3,int milesimas3){
            
        Scanner sc = new Scanner(System.in);
	
        
	System.out.print("Ingrese el tiempo que desea temporizar\n");
        System.out.print("HORAS\n");
        horas3 = sc.nextInt();
        System.out.print("MINUTOS\n");
        minutos3 = sc.nextInt();
        System.out.print("SEGUNDOS\n");
        segundos3 = sc.nextInt();
        System.out.print("DECIMAS DE SEGUNDO\n");
        decimas3= sc.nextInt();
        System.out.print("CENTESIMAS DE SEGUNDO\n");
        centesimas3= sc.nextInt();
        System.out.print("MILESIMAS DE SEGUNDO\n");
        milesimas3 = sc.nextInt();
        
        int n=1;
	int contador_horas=horas3;
        int contador_minutos=minutos3;
        int contador_segundos=segundos3;
        int contador_decimas=decimas3;
        int contador_centesimas=centesimas3;
        int contador_milesimas=milesimas3;
        
         while(contador_horas>0&&contador_horas<24)
         {
           if(contador_milesimas==0)
             {
                 contador_milesimas=10;
                 contador_centesimas--;
                 
              if(contador_centesimas==0)
              { 
                  contador_centesimas=10;
                  contador_decimas--;
                 if(contador_decimas==0)
                 {
                     contador_decimas=10;
                     contador_segundos--;
             
                     if(contador_segundos==0 )
                     {
                      contador_segundos=59;
                      contador_minutos--;
                        if(contador_minutos==0)
                        {
                         contador_minutos=59;
                         contador_horas--;
                        }
                     }
                 }
              } 
            }
                       
                       System.out.print(contador_horas+":"+contador_minutos+":"+contador_segundos+":"+contador_decimas+":"+contador_centesimas+":"+contador_milesimas+"\n");
                      
                     contador_milesimas--;
         }
         
         return 0;
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int n;
        int horas1=0, minutos1=0, segundos1=0 ,decimas1=0,centesimas1=0,milesimas1=0;
        int horas2=0, minutos2=0, segundos2=0 ,decimas2=0,centesimas2=0,milesimas2=0;
        
         System.out.print("Elige si usar cronometro o temporizador\n");
         System.out.print("Ingrese 1 para Cronometro\n"); 
         System.out.print("Ingrese 2 para el Temporizador\n");
          n= sc.nextInt();
        
         
         switch(n){
             
             case 1:
                   cronometro(horas1, minutos1, segundos1,decimas1,centesimas1, milesimas1);
                   break;
             case 2:      
                   Temporizador(horas2, minutos2, segundos2,decimas2,centesimas2,milesimas2);
                   break;
         }
           
    }

   
    
}
