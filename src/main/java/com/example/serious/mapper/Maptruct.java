package com.example.serious.mapper;

import java.util.List;

public interface Maptruct <Dto,Entity>{
    Dto toDto(Entity entity);
    Entity toEntity(Dto dto);
    List<Dto> toDtoList(List<Entity> entities);
    List<Entity> toEntityList(List<Dto> dtos);
}
