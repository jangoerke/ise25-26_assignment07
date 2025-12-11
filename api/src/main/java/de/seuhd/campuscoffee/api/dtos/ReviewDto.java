package de.seuhd.campuscoffee.api.dtos;

import lombok.Builder;

import java.time.LocalDateTime;

import org.jspecify.annotations.Nullable;
import org.jspecify.annotations.NonNull;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


/**
 * DTO record for POS metadata.
 */
@Builder(toBuilder = true)
public record ReviewDto (
    @Nullable Long id,
    // TODO: Implement ReviewDto
    @Nullable LocalDateTime createdAt,
    @Nullable LocalDateTime updatedAt,

    @NotNull
    @NonNull Long posId,

    @NotNull
    @NonNull Long authorId,

    @NotBlank(message = "review cannot be empty.")
    @NonNull String review,

    @Nullable Boolean approved

) implements Dto<Long> {
    @Override
    public @Nullable Long getId() {
        return id;
    }
}
