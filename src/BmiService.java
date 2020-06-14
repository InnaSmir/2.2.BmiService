public class BmiService {
        public float calculate(float weightInKilograms, float heightInMetres) {
            float index = weightInKilograms / (heightInMetres * heightInMetres / 10_000);
            return index;
        }
    }

