package practice.hospital;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float min = 32.0F;
        float max = 40.0F;
        float[] tempPatient = new float[patientsCount];
        for (int i = 0; i <= patientsCount - 1; i++){
            tempPatient[i] = Math.round((((float) Math.random() * (max - min)) + min) * 100) / (float) 100.0;
        }
        return tempPatient;
    }

    public static String getReport(float[] temperatureData) {
        float[] tempPatient = temperatureData;
        float result = 0;
        for (int i = 0; i < tempPatient.length; i++) {
            result += tempPatient[i];
        }
        result = Math.round((result / tempPatient.length) * 100) / (float) 100.0;
        int heatlhPatients = 0;
        for(float i : tempPatient){
            if (i >= 36.2 && i < 37.0){
                heatlhPatients += 1;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < tempPatient.length; i++) {
            if(i == tempPatient.length - 1) {
                stringBuilder = stringBuilder.append(tempPatient[i]).append("");
            } else {
                stringBuilder = stringBuilder.append(tempPatient[i]).append(" ");
            }
        }
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
            Округлите среднюю температуру с помощью Math.round до 2 знаков после запятой,
            а температуры каждого пациента до 1 знака после запятой
        */

        String report =
            "Температуры пациентов: " + stringBuilder +
            "\nСредняя температура: " + result +
            "\nКоличество здоровых: " + heatlhPatients;

        return report;
    }
}
