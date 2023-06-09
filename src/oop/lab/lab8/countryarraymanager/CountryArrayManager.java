package oop.lab.lab8.countryarraymanager;

import java.util.ArrayList;
import java.util.Arrays;

public class CountryArrayManager {
    private Country[] countries;
    private int length;
    private int increment;

    public CountryArrayManager() {
        countries = new Country[1];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[2 * this.countries.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i - 1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population
     * using selection sort algorithm.
     *
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < newArray.length; j++)
                if (newArray[j].getPopulation() < newArray[minIndex].getPopulation()) {
                    minIndex = j;
                }
            if (minIndex != i) {
                Country country = newArray[minIndex];
                newArray[minIndex] = newArray[i];
                newArray[i] = country;
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population
     * using selection sort algorithm.
     *
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < newArray.length; j++)
                if (newArray[j].getPopulation() > newArray[maxIndex].getPopulation()) {
                    maxIndex = j;
                }
            if (maxIndex != i) {
                Country country = newArray[maxIndex];
                newArray[maxIndex] = newArray[i];
                newArray[i] = country;
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray.length - i - 1; j++) {
                if (newArray[j].getArea() > newArray[j + 1].getArea()) {
                    Country country = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = country;
                }
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray.length - i - 1; j++) {
                if (newArray[j].getArea() < newArray[j + 1].getArea()) {
                    Country country = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = country;
                }
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 1; i < newArray.length; ++i) {
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j].getGdp() > key.getGdp()) {
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }
            newArray[j + 1] = key;
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * sing insertion sort algorithm.
     *
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 1; i < newArray.length; ++i) {
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j].getGdp() < key.getGdp()) {
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }
            newArray[j + 1] = key;
        }
        return newArray;
    }
//    public AfricaCountry[] filterAfricaCountry() {
//        /* TODO */
//        List<AfricaCountry> result = new ArrayList<>();
//        for (int i = 0; i < countries.length; i++) {
//            if (countries[i] instanceof AfricaCountry) {
//                result.add((AfricaCountry) countries[i]);
//            }
//        }
//        if (result.size() == 0) {
//            return null;
//        }
//        return result.toArray(new AfricaCountry[0]);
//    }

    public AfricaCountry[] filterAfricaCountry() {
        ArrayList<Country> countryArrayList = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof AfricaCountry) {
                countryArrayList.add(country);
            }
        }
        AfricaCountry[] result = new AfricaCountry[countryArrayList.size()];
        return countryArrayList.toArray(result);


    }

    public AsiaCountry[] filterAsiaCountry() {
        ArrayList<Country> countryArrayList = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof AsiaCountry) {
                countryArrayList.add(country);
            }
        }
        AsiaCountry[] result = new AsiaCountry[countryArrayList.size()];
        return countryArrayList.toArray(result);

    }

    public EuropeCountry[] filterEuropeCountry() {
        ArrayList<Country> countryArrayList = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof EuropeCountry) {
                countryArrayList.add(country);
            }
        }
        EuropeCountry[] result = new EuropeCountry[countryArrayList.size()];
        return countryArrayList.toArray(result);

    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        ArrayList<Country> countryArrayList = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof NorthAmericaCountry) {
                countryArrayList.add(country);
            }
        }
        NorthAmericaCountry[] result = new NorthAmericaCountry[countryArrayList.size()];
        return countryArrayList.toArray(result);
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        ArrayList<Country> countryArrayList = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof OceaniaCountry) {
                countryArrayList.add(country);
            }
        }
        OceaniaCountry[] result = new OceaniaCountry[countryArrayList.size()];
        return countryArrayList.toArray(result);

    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        ArrayList<Country> countryArrayList = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof SouthAmericaCountry) {
                countryArrayList.add(country);
            }
        }
        SouthAmericaCountry[] result = new SouthAmericaCountry[countryArrayList.size()];
        return countryArrayList.toArray(result);
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        return Arrays.copyOf(sortByDecreasingPopulation(), howMany);
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        return Arrays.copyOf(sortByIncreasingPopulation(), howMany);


    }

    public Country[] filterLargestAreaCountries(int howMany) {
        /* TODO */
        return Arrays.copyOf(sortByDecreasingArea(), howMany);


    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        /* TODO */
        return Arrays.copyOf(sortByIncreasingArea(), howMany);
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        /* TODO */
        return Arrays.copyOf(sortByDecreasingGdp(), howMany);


    }

    public Country[] filterLowestGdpCountries(int howMany) {
        /* TODO */
        return Arrays.copyOf(sortByIncreasingGdp(), howMany);


    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
