object Test2 {
  type Histogram = Map[_, Int]  // this is now an existential type!

  type StringlyHistogram = Histogram[_ >: String] // Error: Test2.Histogram does not take type parameters

  val xs: Histogram[String] = Map[String, Int]() // Error: Test2.Histogram does not take type parameters

  val ys: StringlyHistogram[String] = xs // Error: Test2.StringlyHistogram does not take type parameters

  val zs: StringlyHistogram = xs

  val xs1 = xs
  val ys1 = ys
  val zs1 = zs

}
