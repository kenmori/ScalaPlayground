package app.models

/**
  * Created by No51 on 2016/06/05.
  */
//型
sealed trait TicketStatus {}

//scalaではclassに対してメソッドを作るとかはない。
//classと同じオブジェクトを作ってそこにメソッドをつくる
//staticみたいなものはなくしてシステムにたいして一つだけですよというのを保証する
//シングルトンオブジェクトを作る
//値を作っている(インスタンスを作ることができる)
//classにtratをmixinする
object TicketStatus {
  case object Open extends TicketStatus
  case object Fixed extends TicketStatus
}

//Enumがぶつかるので一個オブジェクトを作ってnameSpaceを分ける
//object Open extends TicketStatus //classにtratをmixinするときは
//object Fixed extends TicketStatus



//class名　extends 親クラス名 with トレイト 1 with トレイト2

//javaの場合はimplementが別れているが、scalaは違う
//


//sealedをつけるとこのファイル内で定義されたものしか継承できなくなる
//インスタンスはこのファイルでしか作れなくなる.
//Enumのようなものを作りたかったらsealedをつかったりする
