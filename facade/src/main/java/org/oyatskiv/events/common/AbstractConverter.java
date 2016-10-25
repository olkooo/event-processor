package org.oyatskiv.events.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class AbstractConverter<SOURCE, TARGET> implements Converter<SOURCE, TARGET> {

    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractConverter.class);

    @Override
    public Stream<TARGET> convertStream(final Stream<SOURCE> sources) {
        if(sources == null) {
            LOGGER.warn("convertStream(null) was called. This should never happen.");
            return Stream.empty();
        }

        return sources.map(this::convert);
    }

    @Override
    public Stream<TARGET> convertStream(final Stream<SOURCE> sources, final Function<SOURCE, TARGET> convertMethod) {
        if(sources == null) {
            LOGGER.warn("convertStream(null) was called. This should never happen.");
            return Stream.empty();
        }

        return convertStream(sources, convertMethod);
    }

    @Override
    public List<TARGET> convertList(final Collection<SOURCE> sources) {
        return convertStream(sources.stream()).collect(Collectors.toList());
    }

    @Override
    public List<TARGET> convertList(final Collection<SOURCE> sources, final Function<SOURCE, TARGET> createMethod) {
        return convertStream(sources.stream(), createMethod).collect(Collectors.toList());
    }
}
