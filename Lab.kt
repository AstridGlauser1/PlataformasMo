// No tocar esta clase ---
// Astrid Glauser
// 21299

data class ItemData(
    var originalPos: Int,
    var originalValue: Any,
	var type: String? = null,
    var info: String? = null
)
// -----------------------

fun main() {
    val result = processList(listOf(25, "Hola", null, false))
    println(result)
    
}

fun processList(inputList: List<Any?>?): List<ItemData>? {
   if (inputList == null) { 
        return null
    } else {
         var result = ArrayList<ItemData>()
       
        for ((indice, item) in inputList.withIndex()) {
            when (item) {
              is  String -> result.add(ItemData(
   	originalPos = indice,
   	originalValue = item,
  	type = "cadena",
  	info = ParaString(item)
   )
              )
              is Boolean -> result.add(ItemData(
              	originalPos = indice,
   				originalValue = item,
  				type = "Booleano",
  				info = ParaBooleano(item)
              
              ))
              
              is Int -> result.add(ItemData(
              
                originalPos = indice,
   				originalValue = item,
  				type = "Entero",
  				info = ParaEnteros(item)
              ))
              
           else-> 
               if(item!=null){
                 result.add(ItemData(
                originalPos = indice,
   				originalValue = item,
  				type = "null",
  				info = null  
                   )
                 )
               }
           
                
            }
        
}    
      return result   
    }

}

fun ParaString(cadena:String):String?{
    val numero:Int=(cadena.length)
    return "L"+numero.toString()
}
   
fun ParaEnteros(num:Int):String?{
    if(num%10==0){
        return "M10"
        
    }else if(num%5==0){
        return "M5"
    }
    else if(num%2==0){
        return "M2"
    }
    else{
        return null
    }
       
    }
fun ParaBooleano(bo:Boolean):String?{
    if(bo){
        return "Verdadero"
    }else{
        return "Falso"
    }
}
