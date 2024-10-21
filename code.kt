class Produk(  
var nama: String,
var harga: Double,
var stok: Int,
var merek: String,
var kadarluarsa: Int
){
    
fun show(){
   println("$nama,$harga,$stok,$merek,$kadarluarsa")
}

fun buy(total: Int){
    
   if (stok<total){
       return println("tidak memadai")
   } else if (stok==total){
       return println("habis")
   } else if (stok - total <= 2){
       return println("${stok - total}, stok mulai habis")
   } else if (total>5){
       return println("${stok - total}, anda dapat diskon!")
   } else {
   return println(stok - total)
   }
}

}


fun main() {
    
val desain = Produk(
"bakso",
5.500,
15,
"pedas",
2025,
)

val aksi = 3;
when (aksi) {
  1 ->  {
      print("barang: ");
 desain.show()
  }
  2 ->  {
      print("stok: ")
desain.buy(14)}
  else -> {
      val baru = Produk("bakso",5.500,15,"pedas",2025,)
      println("item ditambahkan");
  }
}

}