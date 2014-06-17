package lila.pool

case class Player(user: lila.common.LightUser, rating: Int) {

  def is(p: Player) = user.id == p.user.id

  def id = user.id

  def withRating(r: Int) = copy(rating = r)
}