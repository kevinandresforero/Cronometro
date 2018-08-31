package aplicacion;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Cronometro {
    int horas,minutos,segundos,decimas,centesimas,milesimas;
    int contador_horas=0,contador_minutos=0,contador_segundos=0,contador_decimas=0,contador_centesimas=0,contador_milesimas=0;
    
    public Cronometro()  
    {
        Scanner sc = new Scanner(System.in);
        this.horas = sc.nextInt() ;
        this.minutos = sc.nextInt() ;
        this.segundos = sc.nextInt() ;
        this.decimas = sc.nextInt() ;
        this.centesimas = sc.nextInt() ;
        this.milesimas = sc.nextInt() ;
    }
    
}
class Avanzar extends Cronometro
{
    public Avanzar ()
    {
        for (contador_horas=0;contador_horas<24;contador_horas++)
	{
            for (contador_minutos=0;contador_minutos<60;contador_minutos++)
            {
                for (contador_segundos=0;contador_segundos<60;contador_segundos++)
		{
                    for (contador_decimas=0;contador_decimas<10;contador_decimas++)
                    {
                        for (contador_centesimas=0;contador_centesimas<100;contador_centesimas++)
                        {
                            for (contador_milesimas=0;contador_milesimas<1000;contador_milesimas++)
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
    }
}


