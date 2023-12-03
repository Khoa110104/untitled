package oop.final2022.countryarraymanager;

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
        if (instance==null) {
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
        if (index >-1 & index<=countryList.size() & country!= null) {
            countryList.add(index,country);
        }
    }

    public void remove(int index) {
        /* TODO */
        if (index >-1& index<countryList.size()) {
            countryList.remove(index);
        }
    }

    public void remove(AbstractCountry country) {
        /* TODO */
        if (country!=null) {
            countryList.remove(country);
        }
    }

    public AbstractCountry countryAt(int index) {
        /* TODO */
        if (index>= 0 & index<countryList.size()) {
            return countryList.get(index);
        }
        return null;
    }

    public List<AbstractCountry> sortPopulationIncreasing() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return left.getPopulation() - right.getPopulation();
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortPopulationDecreasing() {
        /* TODO */
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                return right.getPopulation() - left.getPopulation();
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortAreaIncreasing() {
        List<AbstractCountry> newList = new LinkedList<>(this.countryList);
        Collections.sort(newList, new Comparator<AbstractCountry>() {
            @Override
            public int compare(AbstractCountry left, AbstractCountry right) {
                if (left.getArea() > right.getArea()) {
                    return 1;
                } else if (left.getArea() < right.getArea()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return newList;
    }

    public List<AbstractCountry> sortAreaDecreasing() {
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

    public List<AbstractCountry> sortGdpIncreasing() {
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

    public List<AbstractCountry> sortGdpDecreasing() {
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
//        String[] countinents = {"Asia", "North America", "South America", "Africa", "Europe", "Oceania"};

        List<AbstractCountry> newList = null;
        switch (continent) {
            case "Asia":
                newList = new ArrayList<>();
                for (AbstractCountry country : countryList) {
                    if (country instanceof AsiaCountry) {
                        newList.add(country);
                    }
                }
                break;
            case "North America":
                newList = new ArrayList<>();
                for (AbstractCountry country : countryList) {
                    if (country instanceof NorthAmericaCountry) {
                        newList.add(country);
                    }
                }
                break;
            case "South America":
                newList = new ArrayList<>();
                for (AbstractCountry country : countryList) {
                    if (country instanceof SouthAmericaCountry) {
                        newList.add(country);
                    }
                }
                break;
            case "Africa":
                newList = new ArrayList<>();
                for (AbstractCountry country : countryList) {
                    if (country instanceof AfricaCountry) {
                        newList.add(country);
                    }
                }
                break;
            case "Europe":
                newList = new ArrayList<>();
                for (AbstractCountry country : countryList) {
                    if (country instanceof EuropeCountry) {
                        newList.add(country);
                    }
                }
                break;
            case "Oceania":
                newList = new ArrayList<>();
                for (AbstractCountry country : countryList) {
                    if (country instanceof OceaniaCountry) {
                        newList.add(country);
                    }
                }
        }
        return newList;
    }


    public List<AbstractCountry> filterCountriesMostPopulous(int howMany) {
        /* TODO */
        List<AbstractCountry> list = sortPopulationDecreasing();
        return list.subList(0,Math.min(list.size(), howMany));
    }

    public List<AbstractCountry> filterCountriesLeastPopulous(int howMany) {
        /* TODO */
        List<AbstractCountry> list = sortPopulationIncreasing();
        return list.subList(0, Math.min(list.size(), howMany));
    }

    public List<AbstractCountry> filterCountriesLargestArea(int howMany) {
        /* TODO */
        List<AbstractCountry> list = sortAreaDecreasing();
        return list.subList(0, Math.min(howMany, list.size()));
    }

    public List<AbstractCountry> filterCountriesSmallestArea(int howMany) {
        /* TODO */
        List<AbstractCountry> list = sortAreaIncreasing();
        return list.subList(0, Math.min(howMany, list.size()));
    }

    public List<AbstractCountry> filterCountriesHighestGdp(int howMany) {
        /* TODO */
        List<AbstractCountry> list = sortGdpDecreasing();
        return list.subList(0, Math.min(howMany, list.size()));
    }

    public List<AbstractCountry> filterCountriesLowestGdp(int howMany) {
        /* TODO */
        List<AbstractCountry> list = sortGdpIncreasing();
        return list.subList(0, Math.min(howMany, list.size()));
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
