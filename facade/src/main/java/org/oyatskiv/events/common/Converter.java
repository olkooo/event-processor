package org.oyatskiv.events.common;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public interface Converter<SOURCE, TARGET> {

    TARGET convert(final SOURCE source);

    Stream<TARGET> convertStream(final Stream<SOURCE> sources);

    Stream<TARGET> convertStream(final Stream<SOURCE> sources, final Function<SOURCE, TARGET> convertMethod);

    List<TARGET> convertList(final Collection<SOURCE> sources);

    List<TARGET> convertList(final Collection<SOURCE> sources, final Function<SOURCE, TARGET> createMethod);
}

