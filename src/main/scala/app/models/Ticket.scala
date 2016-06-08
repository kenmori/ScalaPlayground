package app.models

/**
  * Created by No51 on 2016/06/05.
  */
trait Ticket {
 //field
 val id: Long
 val title: String
 val status: TicketStatus
}

class Issue (
              val id: Long,
              val title: String,
              val status: TicketStatus
            ) extends Ticket

class Bug (
            val id: Long,
            val title: String,
            val description: String,
            val status: TicketStatus
          ) extends Ticket

//valを付けることでpublicな値になる
