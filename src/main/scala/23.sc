import scala.annotation.tailrec

def divisors(i: Int): Set[Int] = recDivs(1, i, Set.empty[Int])

@tailrec
def recDivs(div: Int, nom: Int, divisors: Set[Int]): Set[Int] =
  if (div >= nom)
    divisors
  else {
    if (nom % div == 0)
      recDivs(div + 1, nom, divisors.+(div))
    else
      recDivs(div + 1, nom, divisors)
  }

def isAbundant(n: Int, s: Set[Int]): Boolean =
  if (s.isEmpty || (s.reduce(_ + _) < n))
    false
  else
    true

val ints = Vector.range(1, 28124).toSet
val abundantInts = ints.filter(i => isAbundant(i, divisors(i)))
val abundantSums = abundantInts.flatMap(i => abundantInts.map(i + _))
ints.filter(!abundantSums.contains(_)).reduce(_ + _)

