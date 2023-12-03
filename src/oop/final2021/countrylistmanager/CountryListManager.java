package oop.final2021.countrylistmanager;

import java.util.*;

public class CountryListManager {

    // Singleton pattern
    private static CountryListManager instance;

    private List<AbstractCountry> countryList;

    private CountryListManager() {
        countryList = new LinkedList<>();
    }

    public static CountryListManager getInstance() {
        /* TODO */
        if (instance == null) {
            instance = new CountryListManager();
        }
        return instance;
    }

    public List<AbstractCountry> getCountryList() {
        return this.countryList;
    }

    public void append(AbstractCountry country) {
        /* TODO */
        if (country != null) {
            countryList.add(country);
        }
    }

    public void add(AbstractCountry country, int index) {
        /* TODO */
        if (index > -1 & index < countryList.size() & country != null) {
            countryList.add(index, country);
        }
    }

    public void remove(int index) {
        /* TODO */
        if (index > -1 & index < countryList.size()) {
            countryList.remove(index);
        }
    }

    public void remove(AbstractCountry country) {
        /* TODO */
        if (country != null) {
            countryList.remove(country);
        }
    }

    public AbstractCountry countryAt(int index) {
        /* TODO */
        if (index > -1 & index < countryList.size()) {
            return countryList.get(index);
        }
        return null;
    }

    public List<AbstractCountry> sortIncreasingByPopulation() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return left.getPopulation() - right.getPopulation();
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortDecreasingByPopulation() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return right.getPopulation() - left.getPopulation();
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortIncreasingByArea() {
        /* TODO */
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return Double.compare(left.getArea() , right.getArea());
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortDecreasingByArea() {
        /* TODO */
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return Double.compare(right.getArea() , left.getArea());
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortIncreasingByGdp() {
        /* TODO */
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return Double.compare(left.getGdp() , right.getGdp());
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortDecreasingByGdp() {
        /* TODO */
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return Double.compare(right.getGdp() , left.getGdp());
            }
        });
        return newList;
    }

    public List<AbstractCountry> filterContinent(String continent) {
        /* TODO */
        List<AbstractCountry> list = null;
        switch (continent) {
            case "Asia" :
                list = new ArrayList<>();
                for (AbstractCountry country : countryList) {
                    if (country instanceof AsiaCountry){
                        list.add(country);
                    }
                }
                break;
            case "North America" :
                list = new ArrayList<>();
                for (AbstractCountry country : countryList) {
                    if (country instanceof NorthAmericaCountry){
                        list.add(country);
                    }
                }
                break;
            case "South America" :
                list = new ArrayList<>();
                for (AbstractCountry country : countryList) {
                    if (country instanceof SouthAmericaCountry){
                        list.add(country);
                    }
                }
                break;
            case "Africa" :
                list = new ArrayList<>();
                for (AbstractCountry country : countryList) {
                    if (country instanceof AfricaCountry){
                        list.add(country);
                    }
                }
                break;
            case "Oceania" :
                list = new ArrayList<>();
                for (AbstractCountry country : countryList) {
                    if (country instanceof OceaniaCountry){
                        list.add(country);
                    }
                }
                break;
            case "Europe" :
                list = new ArrayList<>();
                for (AbstractCountry country : countryList) {
                    if (country instanceof EuropeCountry){
                        list.add(country);
                    }
                }
                break;
        }
        return list;
    }

    public List<AbstractCountry> filterMostPopulousCountries(int howMany) {
        /* TODO */
        List<AbstractCountry> countries = sortDecreasingByPopulation();
        return countries.subList(0, Math.min(countries.size(), howMany));
    }

    public List<AbstractCountry> filterLeastPopulousCountries(int howMany) {
        /* TODO */
        List<AbstractCountry> countries = sortIncreasingByPopulation();
        return countries.subList(0, Math.min(countries.size(), howMany));
    }

    public List<AbstractCountry> filterLargestAreaCountries(int howMany) {
        /* TODO */
        List<AbstractCountry> countries = sortDecreasingByArea();
        return countries.subList(0, Math.min(countries.size(), howMany));
    }

    public List<AbstractCountry> filterSmallestAreaCountries(int howMany) {
        /* TODO */
        List<AbstractCountry> countries = sortIncreasingByArea();
        return countries.subList(0, Math.min(countries.size(), howMany));
    }

    public List<AbstractCountry> filterHighestGdpCountries(int howMany) {
        /* TODO */
        List<AbstractCountry> countries = sortDecreasingByGdp();
        return countries.subList(0, Math.min(countries.size(), howMany));
    }

    public List<AbstractCountry> filterLowestGdpCountries(int howMany) {
        /* TODO */
        List<AbstractCountry> countries = sortIncreasingByGdp();
        return countries.subList(0, Math.min(countries.size(), howMany));
    }

    public static String codeOfCountriesToString(List<AbstractCountry> countryList) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (AbstractCountry country : countryList) {
            codeOfCountries.append(country.getCode()).append(" ");
        }
        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(List<AbstractCountry> countryList) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (AbstractCountry country : countryList) {
            countriesString.append(country.toString()).append("\n");
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
