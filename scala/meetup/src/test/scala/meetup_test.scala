import org.scalatest._
import java.util.GregorianCalendar

class MeetupTest extends FunSuite with Matchers {
  //Note: Java uses 0-indexed months for GregorianCalendar
  
  val year = 2013

  test ("monteenth of may year") {
    Meetup(5, year).teenth(Meetup.Mon) should be (new GregorianCalendar(year, 4, 13))
  }

  test ("monteenth of august year") {
    Meetup(8, year).teenth(Meetup.Mon) should be (new GregorianCalendar(year, 7, 19))
  }

  test ("monteenth of september year") {
    Meetup(9, year).teenth(Meetup.Mon) should be (new GregorianCalendar(year, 8, 16))
  }

  test ("tuesteenth of march year") {
    Meetup(3, year).teenth(Meetup.Tue) should be (new GregorianCalendar(year, 2, 19))
  }

  test ("tuesteenth of april year") {
    Meetup(4, year).teenth(Meetup.Tue) should be (new GregorianCalendar(year, 3, 16))
  }

  test ("tuesteenth of august year") {
    Meetup(8, year).teenth(Meetup.Tue) should be (new GregorianCalendar(year, 7, 13))
  }

  test ("wednesteenth of january year") {
    Meetup(1, year).teenth(Meetup.Wed) should be (new GregorianCalendar(year, 0, 16))
  }

  test ("wednesteenth of february year") {
    Meetup(2, year).teenth(Meetup.Wed) should be (new GregorianCalendar(year, 1, 13))
  }

  test ("wednesteenth of june year") {
    Meetup(6, year).teenth(Meetup.Wed) should be (new GregorianCalendar(year, 5, 19))
  }

  test ("thursteenth of may year") {
    Meetup(5, year).teenth(Meetup.Thu) should be (new GregorianCalendar(year, 4, 16))
  }

  test ("thursteenth of june year") {
    Meetup(6, year).teenth(Meetup.Thu) should be (new GregorianCalendar(year, 5, 13))
  }

  test ("thursteenth of september year") {
    Meetup(9, year).teenth(Meetup.Thu) should be (new GregorianCalendar(year, 8, 19))
  }

  test ("friteenth of april year") {
    Meetup(4, year).teenth(Meetup.Fri) should be (new GregorianCalendar(year, 3, 19))
  }

  test ("friteenth of august year") {
    Meetup(8, year).teenth(Meetup.Fri) should be (new GregorianCalendar(year, 7, 16))
  }

  test ("friteenth of september year") {
    Meetup(9, year).teenth(Meetup.Fri) should be (new GregorianCalendar(year, 8, 13))
  }

  test ("saturteenth of february year") {
    Meetup(2, year).teenth(Meetup.Sat) should be (new GregorianCalendar(year, 1, 16))
  }

  test ("saturteenth of april year") {
    Meetup(4, year).teenth(Meetup.Sat) should be (new GregorianCalendar(year, 3, 13))
  }

  test ("saturteenth of october year") {
    Meetup(10, year).teenth(Meetup.Sat) should be (new GregorianCalendar(year, 9, 19))
  }

  test ("sunteenth of map year") {
    Meetup(5, year).teenth(Meetup.Sun) should be (new GregorianCalendar(year, 4, 19))
  }

  test ("sunteenth of june year") {
    Meetup(6, year).teenth(Meetup.Sun) should be (new GregorianCalendar(year, 5, 16))
  }

  test ("sunteenth of october year") {
    Meetup(10, year).teenth(Meetup.Sun) should be (new GregorianCalendar(year, 9, 13))
  }

  test ("first monday of march year") {
    Meetup(3, year).first(Meetup.Mon) should be (new GregorianCalendar(year, 2, 4))
  }

  test ("first monday of april year") {
    Meetup(4, year).first(Meetup.Mon) should be (new GregorianCalendar(year, 3, 1))
  }

  test ("first tuesday of may year") {
    Meetup(5, year).first(Meetup.Tue) should be (new GregorianCalendar(year, 4, 7))
  }

  test ("first tuesday of june year") {
    Meetup(6, year).first(Meetup.Tue) should be (new GregorianCalendar(year, 5, 4))
  }

  test ("first wednesday of july year") {
    Meetup(7, year).first(Meetup.Wed) should be (new GregorianCalendar(year, 6, 3))
  }

  test ("first wednesday of august year") {
    Meetup(8, year).first(Meetup.Wed) should be (new GregorianCalendar(year, 7, 7))
  }

  test ("first thursday of september year") {
    Meetup(9, year).first(Meetup.Thu) should be (new GregorianCalendar(year, 8, 5))
  }

  test ("first thursday of october year") {
    
    Meetup(10, year).first(Meetup.Thu) should be (new GregorianCalendar(year, 9, 3))
  }

  test ("first friday of november year") {
    
    Meetup(11, year).first(Meetup.Fri) should be (new GregorianCalendar(year, 10, 1))
  }

  test ("first friday of december year") {
    
    Meetup(12, year).first(Meetup.Fri) should be (new GregorianCalendar(year, 11, 6))
  }

  test ("first saturday of january year") {
    
    Meetup(1, year).first(Meetup.Sat) should be (new GregorianCalendar(year, 0, 5))
  }

  test ("first saturday of february year") {
    
    Meetup(2, year).first(Meetup.Sat) should be (new GregorianCalendar(year, 1, 2))
  }

  test ("first sunday of march year") {
    
    Meetup(3, year).first(Meetup.Sun) should be (new GregorianCalendar(year, 2, 3))
  }

  test ("first sunday of april year") {
    
    Meetup(4, year).first(Meetup.Sun) should be (new GregorianCalendar(year, 3, 7))
  }

  test ("second monday of march year") {
    
    Meetup(3, year).second(Meetup.Mon) should be (new GregorianCalendar(year, 2, 11))
  }

  test ("second monday of april year") {
    
    Meetup(4, year).second(Meetup.Mon) should be (new GregorianCalendar(year, 3, 8))
  }

  test ("second tuesday of may year") {
    Meetup(5, year).second(Meetup.Tue) should be (new GregorianCalendar(year, 4, 14))
  }

  test ("second tuesday of june year") {
    
    Meetup(6, year).second(Meetup.Tue) should be (new GregorianCalendar(year, 5, 11))
  }

  test ("second wednesday of july year") {
    
    Meetup(7, year).second(Meetup.Wed) should be (new GregorianCalendar(year, 6, 10))
  }

  test ("second wednesday of august year") {
    
    Meetup(8, year).second(Meetup.Wed) should be (new GregorianCalendar(year, 7, 14))
  }

  test ("second thursday of september year") {
    
    Meetup(9, year).second(Meetup.Thu) should be (new GregorianCalendar(year, 8, 12))
  }

  test ("second thursday of october year") {
    
    Meetup(10, year).second(Meetup.Thu) should be (new GregorianCalendar(year, 9, 10))
  }

  test ("second friday of november year") {
    
    Meetup(11, year).second(Meetup.Fri) should be (new GregorianCalendar(year, 10, 8))
  }

  test ("second friday of december year") {
    
    Meetup(12, year).second(Meetup.Fri) should be (new GregorianCalendar(year, 11, 13))
  }

  test ("second saturday of january year") {
    
    Meetup(1, year).second(Meetup.Sat) should be (new GregorianCalendar(year, 0, 12))
  }

  test ("second saturday of february year") {
    
    Meetup(2, year).second(Meetup.Sat) should be (new GregorianCalendar(year, 1, 9))
  }

  test ("second sunday of march year") {
    
    Meetup(3, year).second(Meetup.Sun) should be (new GregorianCalendar(year, 2, 10))
  }

  test ("second sunday of april year") {
    
    Meetup(4, year).second(Meetup.Sun) should be (new GregorianCalendar(year, 3, 14))
  }

  test ("third monday of march year") {
    
    Meetup(3, year).third(Meetup.Mon) should be (new GregorianCalendar(year, 2, 18))
  }

  test ("third monday of april year") {
    
    Meetup(4, year).third(Meetup.Mon) should be (new GregorianCalendar(year, 3, 15))
  }

  test ("third tuesday of may year") {
    
    Meetup(5, year).third(Meetup.Tue) should be (new GregorianCalendar(year, 4, 21))
  }

  test ("third tuesday of june year") {
    
    Meetup(6, year).third(Meetup.Tue) should be (new GregorianCalendar(year, 5, 18))
  }

  test ("third wednesday of july year") {
    
    Meetup(7, year).third(Meetup.Wed) should be (new GregorianCalendar(year, 6, 17))
  }

  test ("third wednesday of august year") {
    
    Meetup(8, year).third(Meetup.Wed) should be (new GregorianCalendar(year, 7, 21))
  }

  test ("third thursday of september year") {
    
    Meetup(9, year).third(Meetup.Thu) should be (new GregorianCalendar(year, 8, 19))
  }

  test ("third thursday of october year") {
    
    Meetup(10, year).third(Meetup.Thu) should be (new GregorianCalendar(year, 9, 17))
  }

  test ("third friday of november year") {
    
    Meetup(11, year).third(Meetup.Fri) should be (new GregorianCalendar(year, 10, 15))
  }

  test ("third friday of december year") {
    
    Meetup(12, year).third(Meetup.Fri) should be (new GregorianCalendar(year, 11, 20))
  }

  test ("third saturday of january year") {
    
    Meetup(1, year).third(Meetup.Sat) should be (new GregorianCalendar(year, 0, 19))
  }

  test ("third saturday of february year") {
    
    Meetup(2, year).third(Meetup.Sat) should be (new GregorianCalendar(year, 1, 16))
  }

  test ("third sunday of march year") {
    
    Meetup(3, year).third(Meetup.Sun) should be (new GregorianCalendar(year, 2, 17))
  }

  test ("third sunday of april year") {
    
    Meetup(4, year).third(Meetup.Sun) should be (new GregorianCalendar(year, 3, 21))
  }

  test ("fourth monday of march year") {
    
    Meetup(3, year).fourth(Meetup.Mon) should be (new GregorianCalendar(year, 2, 25))
  }

  test ("fourth monday of april year") {
    
    Meetup(4, year).fourth(Meetup.Mon) should be (new GregorianCalendar(year, 3, 22))
  }

  test ("fourth tuesday of may year") {
    
    Meetup(5, year).fourth(Meetup.Tue) should be (new GregorianCalendar(year, 4, 28))
  }

  test ("fourth tuesday of june year") {
    
    Meetup(6, year).fourth(Meetup.Tue) should be (new GregorianCalendar(year, 5, 25))
  }

  test ("fourth wednesday of july year") {
    
    Meetup(7, year).fourth(Meetup.Wed) should be (new GregorianCalendar(year, 6, 24))
  }

  test ("fourth wednesday of august year") {
    
    Meetup(8, year).fourth(Meetup.Wed) should be (new GregorianCalendar(year, 7, 28))
  }

  test ("fourth thursday of september year") {
    
    Meetup(9, year).fourth(Meetup.Thu) should be (new GregorianCalendar(year, 8, 26))
  }

  test ("fourth thursday of october year") {
    
    Meetup(10, year).fourth(Meetup.Thu) should be (new GregorianCalendar(year, 9, 24))
  }

  test ("fourth friday of november year") {
    
    Meetup(11, year).fourth(Meetup.Fri) should be (new GregorianCalendar(year, 10, 22))
  }

  test ("fourth friday of december year") {
    
    Meetup(12, year).fourth(Meetup.Fri) should be (new GregorianCalendar(year, 11, 27))
  }

  test ("fourth saturday of january year") {
    
    Meetup(1, year).fourth(Meetup.Sat) should be (new GregorianCalendar(year, 0, 26))
  }

  test ("fourth saturday of february year") {
    
    Meetup(2, year).fourth(Meetup.Sat) should be (new GregorianCalendar(year, 1, 23))
  }

  test ("fourth sunday of march year") {
    
    Meetup(3, year).fourth(Meetup.Sun) should be (new GregorianCalendar(year, 2, 24))
  }

  test ("fourth sunday of april year") {
    
    Meetup(4, year).fourth(Meetup.Sun) should be (new GregorianCalendar(year, 3, 28))
  }

  test ("last monday of march year") {
    
    Meetup(3, year).last(Meetup.Mon) should be (new GregorianCalendar(year, 2, 25))
  }

  test ("last monday of april year") {

    Meetup(4, year).last(Meetup.Mon) should be (new GregorianCalendar(year, 3, 29))
  }

  test ("last tuesday of may year") {
    
    Meetup(5, year).last(Meetup.Tue) should be (new GregorianCalendar(year, 4, 28))
  }

  test ("last tuesday of june year") {
    
    Meetup(6, year).last(Meetup.Tue) should be (new GregorianCalendar(year, 5, 25))
  }

  test ("last wednesday of july year") {
    Meetup(7, year).last(Meetup.Wed) should be (new GregorianCalendar(year, 6, 31))
  }

  test ("last wednesday of august year") {
    
    Meetup(8, year).last(Meetup.Wed) should be (new GregorianCalendar(year, 7, 28))
  }

  test ("last thursday of september year") {
    
    Meetup(9, year).last(Meetup.Thu) should be (new GregorianCalendar(year, 8, 26))
  }

  test ("last thursday of october year") {
    
    Meetup(10, year).last(Meetup.Thu) should be (new GregorianCalendar(year, 9, 31))
  }

  test ("last friday of november year") {
    
    Meetup(11, year).last(Meetup.Fri) should be (new GregorianCalendar(year, 10, 29))
  }

  test ("last friday of december year") {
    
    Meetup(12, year).last(Meetup.Fri) should be (new GregorianCalendar(year, 11, 27))
  }

  test ("last saturday of january year") {
    
    Meetup(1, year).last(Meetup.Sat) should be (new GregorianCalendar(year, 0, 26))
  }

  test ("last saturday of february year") {
    Meetup(2, year).last(Meetup.Sat) should be (new GregorianCalendar(year, 1, 23))
  }

  test ("last sunday of march year") {
    
    Meetup(3, year).last(Meetup.Sun) should be (new GregorianCalendar(year, 2, 31))
  }

  test ("last sunday of april year") {
    
    Meetup(4, year).last(Meetup.Sun) should be (new GregorianCalendar(year, 3, 28))
  }
}
