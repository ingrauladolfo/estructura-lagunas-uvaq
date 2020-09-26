import java.util.ArrayList;
public class Pila extends ArrayList{
 
 //se añade un elemento a la pila.(push)
 public void apilar(Object dato){
  if(dato != null){
   this.add(dato);
  }else{
   System.out.println("Introduzca un dato no nulo");
  }  
 }
 
 //se elimina el elemento frontal de la pila.(pop)
 public void desapilar(){
  if(size() > 0){
   this.remove(this.size()-1);
  }
 }
 
 //devuelve el elemento que esta en la cima de la pila. (top o peek)
 public Object cima(){
  Object datoAuxiliar = null;
  if(this.size() > 0){
   datoAuxiliar = this.get(this.size()-1);
  }
  return datoAuxiliar;  
 }
 
 //devuelve cierto si la pila está vacía o falso en caso contrario (empty).
 public boolean vacia(){
  return this.isEmpty();
 }
}


 
 


//Autor:Rey Salcedo Padilla
import java.util.ArrayList;
public class Cola extends ArrayList{
 
 //se añade un elemento a la cola. Se añade al final de esta.
 public void encolar(Object dato){
  if(dato != null){
   this.add(dato);
  }else{
   System.out.println("Introduzca un dato no nulo");
  }  
 }

 //se elimina el elemento frontal de la cola, es decir, el primer elemento que entró.
 public void desencolar(){
  if(this.size() > 0){
   this.remove(0);
  }
 }
 
 //se devuelve el elemento frontal de la cola, es decir, el primer elemento que entró.
 public Object frente(){
  Object datoAuxiliar = null;
  if(this.size() > 0){
   datoAuxiliar = this.get(0);
  }
  return datoAuxiliar;  
 }
 
 //devuelve cierto si la pila está vacía o falso en caso contrario (empty).
 public boolean vacia(){
  return this.isEmpty();
 }
}


 
 


//Autor:Rey Salcedo Padilla
public class Main{
 public static void main(String []args){
  
  System.out.println("------Pila------");
  Pila pila = new Pila();
  pila.apilar("A");
  pila.apilar("B");
  pila.apilar("C");
  pila.apilar("D");
  
  System.out.println("Esta vacia la pila?:" + pila.vacia());
  System.out.println("Tamaño de la pila:" + pila.size());
  
  System.out.println(pila.cima());
  pila.desapilar();
  System.out.println(pila.cima());
  pila.desapilar();
  System.out.println(pila.cima());
  pila.desapilar();
  System.out.println(pila.cima());
  pila.desapilar();
  
  System.out.println("Esta vacia la pila?:" + pila.vacia());
    
  System.out.println("------Cola------");
  Cola cola = new Cola();
  cola.encolar("A");
  cola.encolar("B");
  cola.encolar("C");
  cola.encolar("D");
  
  System.out.println("Esta vacia la cola?:" + cola.vacia());
  System.out.println("Tamaño de la cola:" + cola.size());
  
  System.out.println(cola.frente());
  cola.desencolar();
  System.out.println(cola.frente());
  cola.desencolar();
  System.out.println(cola.frente());
  cola.desencolar();
  System.out.println(cola.frente());
  cola.desencolar();
  
  System.out.println("Esta vacia la cola?:" + cola.vacia());
 }
}