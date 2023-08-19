package pkg;
import java.util.ArrayList;
import java.util.List;

 public class ArrayListSample {
     public void ListaTareas(){
         List<ClsTakeList> tl = new ArrayList<>();
         ClsTakeList tarea = new ClsTakeList();

         tarea.setTaskName("Ir a votar");
         tarea.setTaskDescription("escuela, mesa 5");
         tarea.setIsDone(String.valueOf(false));
         tl.add(tarea);
         tarea = new ClsTakeList();

         tarea.setTaskName("sacar al cucho ");
         tarea.setTaskDescription("llevar a firulais al parque ");
         tarea.setIsDone(String.valueOf(false));
         tl.add(tarea);
         tarea = new ClsTakeList();

         tarea.setTaskName("hacer la cama ");
         tarea.setTaskDescription("mi mama me regaña ");
         tarea.setIsDone(String.valueOf(false));
         tl.add(tarea);
         tarea = new ClsTakeList();

         for (ClsTakeList item : tl){
             System.out.println("Tarea:"+item.getTaskName());
         }

         }
 }