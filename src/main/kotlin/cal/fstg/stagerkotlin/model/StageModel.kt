package cal.fstg.stagerkotlin.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class StageModel(
        @Id var id: Long
)