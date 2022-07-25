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
    println(result) }
fun processList(inputList: List<Any?>?): List<ItemData>? {
   if (inputList == null) { 
        return null
   } else {
         var result = ArrayList<ItemData>()
        for ((indice, item) in inputList.withIndex()) { 
 when (item) {
 is  String -> result.add(ItemData( indice,item,"cadena","L" +item.length.toString()))
 is Boolean -> result.add(ItemData(indice, item, "Booleano", if(item){"Verdadero"}else{"Falso"}))
 is Int -> result.add(ItemData( indice,item, "Entero", if(item%10==0){"M10"}else if(item%5==0){"M5"}else if(item%2==0) {"M2"}else{null}))
 else-> if(item!=null){result.add(ItemData( indice, item, "null",null))}
           }
        }    
      return result   
    }
}
