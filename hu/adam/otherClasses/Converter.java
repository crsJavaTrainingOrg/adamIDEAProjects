package hu.adam.otherClasses;
@FunctionalInterface
 interface Converter<F,T> {
     T convert (F from);

}
