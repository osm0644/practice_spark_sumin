package mkt.udon

import mkt.udon.config.UdonStatBatchConfig
import mkt.udon.core.common.Environment
import mkt.udon.infra.spark.SparkBase
import org.apache.log4j.LogManager
import org.apache.spark.sql.SparkSession

object UdonStatBatch extends SparkBase {
  override val logger = LogManager.getLogger(this.getClass.getName)

  override def driver(session: SparkSession): Unit = {
    /**
     * 환경변수 추출 및 설정
     */
    implicit val configHint = Environment.buildConfigHint[UdonStatBatchConfig]()
    val config = Environment.getConfigOrThrow[UdonStatBatchConfig]

    /**
     * 데이터 추출 및 가공
     */



     }
}