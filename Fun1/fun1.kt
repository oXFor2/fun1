import java.util.Collections

   fun main(){
        myfun2("Hypotettically")
   }
   
   fun myfun2(x: String){
       var y: MutableList<Char> = mutableListOf()
       y = x.toMutableList()
       var max = 0
       var max2 = 0
       var let1 = ""
       var let2 = ""
       for (z in y.distinct()){
           if (max < Collections.frequency(y, z)){
               max = Collections.frequency(y, z)
               let1 = z.toString()
           }
       }
           for (i in y.distinct()){
               if (let1 == i.toString()){
                   continue
               }
               else if (max2 < Collections.frequency(y, i)){
                   max2 = Collections.frequency(y, i)
                   let2 = i.toString()
               }
           }
       println("Самая частая первая буква " + let1 + " колличество: " + max)
       println("Самая частая вторая буква " + let2 + " колличество: " + max2)
   }
