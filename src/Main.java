public class Main {
    public static void main(String[] args) {
//  1) Жаны проект тузунуз.
// 2) 3 жаны пакет тузунуз - model, service, db.
// 3) model пакеттин ичине Person,Animal деген класс тузунуз,
// свойствалары - id, name, age, Gender, Genderди enum кылып башка пакетке тузуп койсонуз болот.
// 4) db пакеттин ичине Database деген класс тузунуз,
// ичинде 2 свойствасы болот - userлер, animalдар. Бул класс биздин база данных болот.
// 5) service пакеттин ичине GenericService деген generic interface тузунуз жана impl деген пакет тузуп коюнуз.
// 6) GenericServiceтин ичинде 7 метод болот:
//        - String add(List<T>t);
//        - T getById(Long id);
//        - String removeByName(String name);
//        - List<T> getAll();
//        - List<T> sortByName(); 1 ди басканда ascending, 2 ни басканда descending кылып сорттосун
//   - List<T> filterByGender(); 1 ди басканда female, 2 ни басканда male кылып фильтрлесин
//   - List<T> clear();
//  7) impl пакеттин ичине PersonServiceImpl, AnimalServiceImpl деген класстарды тузунуз,
//  бул класстар GenericService интерфейсин ишке ашырат жана бул класстарда свойства катары биздин база данных болот(Database).
//  8) Класстарда GenericService интерфейсинин бардык методдорун ишке ашырыныз.
//  PersonServiceImpl методдору стандарттык турдо ал эми AnimalServiceImpl методдору stream аркылуу ишке ашырылсын.
//  9) Main класста бардык методдорду чакырып иштетиниз
    }
}