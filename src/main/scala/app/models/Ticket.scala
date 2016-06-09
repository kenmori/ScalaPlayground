package app.models

/**
  * Created by No51 on 2016/06/05.
  */
rait Ticket {
 //field
 val id: Long
 val title: String
 val status: TicketStatus
}
case class Issue (
              val id: TicketId,//packageから参照
              val title: String,
              val status: TicketStatus = TicketStatus.Open //default
            ) extends Ticket

case class Bug (
            val id: TicketId, //packageから参照
            val title: String,
            val description: String,
            val status: TicketStatus = TicketStatus.Open
          ) extends Ticket

//valを付けることでpublicな値になる
//caseをつけるとvalがとれる(publicなフィールドにしてくれる)　いろんなメソッドをnewしないでIssue.applyアプライ
//applyは省略することができる caseをつけると
//caseをつけるとstaticなファクトリを生成することができる
//scalaはstaticはない


//case
//caseクラスをcaseクラスを継承できない
//subクラスでcaseを使う場合caseクラスを使わない(//equlesが一致しなくなるので)