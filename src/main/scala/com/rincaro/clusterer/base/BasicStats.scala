package com.rincaro.clusterer.base

trait BasicStats {
  def getMovement: Double

  def getNonEmptyClusters: Int

  def getEmptyClusters: Int

  def getRound: Int
}
