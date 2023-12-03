package oop.final2021.countryarraymanager;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static CountryArrayManager countryArrayManager = new CountryArrayManager();

    public static void main(String[] args) {
        /* TODO */
        // Viết code cho các hàm test.
        // Kết quả chạy chương trình lưu vào file <Mã số sinh viên>CountryListManager.txt và nộp cùng source code.
        System.out.println("\n===============================");
        testSortIncreasingByPopulation();
        testSortDecreasingByPopulation();

        System.out.println("\n===============================");
        testSortIncreasingByArea();
        testSortDecreasingByArea();

        System.out.println("\n===============================");
        testSortIncreasingByGdp();
        testSortDecreasingByGdp();

        System.out.println("\n===============================");
        testFilterContinent("Asia");
        testFilterContinent("North America");
        testFilterContinent("South America");
        testFilterContinent("Oceania");
        testFilterContinent("Africa");
        testFilterContinent("Europe");

        System.out.println("\n===============================");
        testFilterMostPopulousCountries();
        testFilterLeastPopulousCountries();

        System.out.println("\n===============================");
        testFilterLargestAreaCountries();
        testFilterSmallestAreaCountries();

        System.out.println("\n===============================");
        testFilterHighestGdpCountries();
        testFilterLowestGdpCountries();

    }

    public static void readArrayData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            //dataReader = new BufferedReader(new FileReader("data/nations1.csv"));
            dataReader = new BufferedReader(new FileReader(filePath));

            // How to read file in java line by line?
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 6) {
                    continue;
                }

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                // Parse data and create CountryData objects
                CountryData newCountryData = new CountryData(dataList.get(0))
                        .setName(dataList.get(1))
                        .setPopulation(Integer.parseInt(dataList.get(2)))
                        .setArea(Double.parseDouble(dataList.get(3)))
                        .setGdp(Double.parseDouble(dataList.get(4)))
                        .setContinent(dataList.get(5));
                countryArrayManager.append(newCountryData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null)
                    dataReader.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void init() {
        String filePath = "src/oop/final2021/countryarraymanager/countries1.csv ";
        readArrayData(filePath);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testOriginalData() {
        init();
        String codes = countryArrayManager.codeOfCountriesToString(countryArrayManager.getCountryDataArray(), countryArrayManager.getLength());
        System.out.println(codes);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testSortIncreasingByPopulation() {
        init();
        CountryData[] countries = countryArrayManager.sortIncreasingByPopulation();
        String codes = countryArrayManager.codeOfCountriesToString(countries, countries.length);
        System.out.println(codes);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testSortDecreasingByPopulation() {
        /* TODO */
        CountryData[] countries = countryArrayManager.sortDecreasingByPopulation();
        String codes = countryArrayManager.codeOfCountriesToString(countries, countries.length);
        System.out.println(codes);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testSortIncreasingByArea() {
        /* TODO */
        CountryData[] countries = countryArrayManager.sortIncreasingByArea();
        String codes = countryArrayManager.codeOfCountriesToString(countries, countries.length);
        System.out.println(codes);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testSortDecreasingByArea() {
        /* TODO */
        CountryData[] countries = countryArrayManager.sortDecreasingByArea();
        String codes = countryArrayManager.codeOfCountriesToString(countries, countries.length);
        System.out.println(codes);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testSortIncreasingByGdp() {
        /* TODO */
        CountryData[] countries = countryArrayManager.sortIncreasingByGdp();
        String codes = countryArrayManager.codeOfCountriesToString(countries, countries.length);
        System.out.println(codes);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testSortDecreasingByGdp() {
        /* TODO */
        CountryData[] countries = countryArrayManager.sortDecreasingByGdp();
        String codes = countryArrayManager.codeOfCountriesToString(countries, countries.length);
        System.out.println(codes);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testFilterContinent(String continent) {
        /* TODO */
        CountryData[] countries = countryArrayManager.filterContinent(continent);
        System.out.println(CountryArrayManager.codeOfCountriesToString(countries,countries.length));
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA]
    public static void testFilterMostPopulousCountries() {
        /* TODO */
        CountryData[] countries = countryArrayManager.filterMostPopulousCountries(5);
        System.out.println(countryArrayManager.codeOfCountriesToString(countries,countries.length));
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA]
    public static void testFilterLeastPopulousCountries() {
        /* TODO */
        CountryData[] countries = countryArrayManager.filterLeastPopulousCountries(5);
        System.out.println(countryArrayManager.codeOfCountriesToString(countries,countries.length));
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA]
    public static void testFilterLargestAreaCountries() {
        /* TODO */
        CountryData[] countries = countryArrayManager.filterLargestAreaCountries(5);
        System.out.println(countryArrayManager.codeOfCountriesToString(countries,countries.length));
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA]
    public static void testFilterSmallestAreaCountries() {
        /* TODO */
        CountryData[] countries = countryArrayManager.filterSmallestAreaCountries(5);
        System.out.println(countryArrayManager.codeOfCountriesToString(countries,countries.length));
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA]
    public static void testFilterHighestGdpCountries() {
        /* TODO */
        CountryData[] countries = countryArrayManager.filterHighestGdpCountries(5);
        System.out.println(countryArrayManager.codeOfCountriesToString(countries,countries.length));
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA]
    public static void testFilterLowestGdpCountries() {
        /* TODO */
        CountryData[] countries = countryArrayManager.filterLowestGdpCountries(5);
        System.out.println(countryArrayManager.codeOfCountriesToString(countries,countries.length));
    }
}
