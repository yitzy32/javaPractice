public class Person {
  double height;
  double weight;

  double getBmi(double height, double weight) {
    double heightMeters = height / 39.37;
    double heightMetersSquared = heightMeters * heightMeters;
    double weightKilo = weight / 2.205;
    
    double bmi = weightKilo / heightMetersSquared;

    return bmi;
  }
}
