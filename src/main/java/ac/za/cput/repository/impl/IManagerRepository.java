/**
 ITeamRepository.java
 Repository interface for the Team
 Author: Panashe Muinzani (218186568)
 Date: 09 April 2022
 */

package ac.za.cput.repository.impl;
import ac.za.cput.entity.Manager;
import ac.za.cput.repository.IRepository;

import java.util.Set;

public interface IManagerRepository extends IRepository<Manager, String> {
    Set<Manager> getAll();
}