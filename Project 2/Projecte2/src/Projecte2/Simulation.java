/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projecte2;

/**
 *
 * @author JordiBlancoLopez y JesusFernandezCidDeRivera
 */
public class Simulation {
    final static  int MAX_CASHIERS = 10;
    final static int T_PROCESS = 120;
    final static int NUM_CLIENTS = 100;
    final static int T_LLEGADA = 15;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        simulation();
    }
        
   
    public static void simulation()
    {
        Client client;
        LinkedQueue<Client> cuaDeClients = new LinkedQueue<Client>();
        int []  cashierTime = new int [MAX_CASHIERS];
        int tempsTotal, averageTime, tempsDeSortida;


        //aquest bucle és per fer la simulació amb tots els caixers
        for (int cashier = 0; cashier < MAX_CASHIERS; cashier++){
            
            /* Para cada cajero cargamos la cua, inicializamos los tiempos de los cajeros a 0 y reseteamos el tiempo total
            y luego hacemos la simulacion para saber el tiempo total con ese numero de cajeros */
            
            carregarCua(cuaDeClients);                          //No hay clientes o los les hemos hecho treure, por lo que volvemos a cargar la cua.
            initTempsCaixers (cashierTime, cashier);     
            tempsTotal= 0;                                      //Reseteamos el Tiempo total para cada simulacion con X cajeros.
            while (!cuaDeClients.isEmpty()){
                     
                for (int j = 0; j<=cashier; j++){
                    
                    if(!cuaDeClients.isEmpty()){
                        client = cuaDeClients.treure();
                       
                        if (client.getTllegada() >= cashierTime[j]){   //El cliente no espera cuando el cajero esta libre (es menor que el Tllegada)
                            client.setTSalida(client.getTllegada()+T_PROCESS);  //Tsalida = Tllegada + TPROCESS
                        }
                        
                        else{    
                            //El cliente tiene que esperar, por lo que hay que sumarle el tiempo en el que el cajero se queda libre + lo que tarde en procesarlo.
                            client.setTSalida(cashierTime[j]+T_PROCESS);    //Tsalida = Tiempo en el que acaba el cajero + T_PROCESS
                        }
                        
                        cashierTime[j] = client.getTsalida();   //Actualizamos el tiempo del cajero.
                        tempsTotal += client.getTotal();        //Vamos aumentando el total del tiempo de clientes.
                    }
                }                                       
            }
            
            averageTime = tempsTotal / NUM_CLIENTS;
            System.out.println ("Numero de cajeros: " + (cashier+1) );
            System.out.println ("Tiempo medio en ser atendidos (en segundos): " + averageTime + "\n");
        }       
    }



    public static void carregarCua(LinkedQueue lc){      //Esta funcion añade el numero de clientes a una lista que se pasa por parametr{
        
        for(int i=1;i<= NUM_CLIENTS;i++){
            lc.inserir(new Client(i*T_LLEGADA));      //Cliente1: 15, Cliente2:30, Cliente 3: 45....... Cliente(i): i*15
              
        }      
    }
    
    public static void initTempsCaixers (int [] tc, int end){        //Inicializa las posiciones del array a 0
        for (int i = 0; i<=end; i++){
            tc[i] = 0;      
        }
    }
}
