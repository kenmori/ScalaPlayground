package app.models

import sun.security.krb5.internal.Ticket

/**
  * Created by No51 on 2016/06/05.
  */
//Idをチケットを内部で格納したいTicketRepo
//object TicketRepo {
// type TicketId = Long //他のLong値が入ってくるとやあy湖しくなるから
// private dap: Map[Long, Ticket] = Map() //mutableになる可能性があるからvar //keyはLong, valはTicket
//}
//valは再代入ができない
//var できる

//タイプエイリアス

//ploted subClass
//private 自分自身

//分かりやすくなった


object TicketRepo {
 private var map: Map[TicketId, Ticket] = Map() //mutableになる可能性があるからvar //keyはLong, valはTicket
 def findAll : Seq[Ticket] = ??? //全てのTicketIdを取り出す シーケンスは何者？？
 def findById(id: TicketId) : Option [Ticket] = ???
 def createIssue(title: String) : Issue = ???
 def createBug(title: String, description: String) : Bug = ???
 def findIssuesByStatus(status: TicketStatus): Seq[Issue] = ???
 def findBugsByStatus(status: TicketStatus) : Seq[Bug] = ???
 def fix(id: TicketId): Boolean = ???
 println("fafafa")
}

//type はclassのオブジェクトやメンバにしかおけない
//privateやprotect はpackage参照を宣言できる
//private[app] type TicketId = TicketId

//classの前とコンストラクタの前のprivateは可視性の範囲の違い


//Travaersable　forEachを持っている
//iterabl　トラバーサルとイテレータが別れている→効率がよくなるから

//Seq　JAvaでいうListのようなもの RubyでいうArray
//Map keyとvalue //順序がない //MapもIterableを継承している(javaとの違い)
//Set 重複を許さない


//引数ないときは()は書いたらエラー