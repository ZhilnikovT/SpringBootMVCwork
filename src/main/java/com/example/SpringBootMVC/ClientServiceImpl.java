package com.example.SpringBootMVC;

import com.example.SpringBootMVC.model.Client1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.stereotype.Service;

@Service
public class  ClientServiceImpl implements ClientService {
    // Хранилище клиентов
   private static final Map<Integer, Client1> CLIENT_REPOSITORY_MAP = new HashMap<>();

   // Переменная для генерации ID клиента
   private static final AtomicInteger CLIENT_ID_HOLDER = new AtomicInteger();

   @Override
   public void create(Client1 client) {
       final int clientId = CLIENT_ID_HOLDER.incrementAndGet();
       client.setId(clientId);
       CLIENT_REPOSITORY_MAP.put(clientId, client);
   }

   @Override
   public List<Client1> readAll() {
       return new ArrayList<>(CLIENT_REPOSITORY_MAP.values());
   }

   @Override
   public Client1 read(int id) {
       return CLIENT_REPOSITORY_MAP.get(id);
   }

   @Override
   public boolean update(Client1 client, int id) {
       if (CLIENT_REPOSITORY_MAP.containsKey(id)) {
           client.setId(id);
           CLIENT_REPOSITORY_MAP.put(id, client);
           return true;
       }

       return false;
   }

   @Override
   public boolean delete(int id) {
       return CLIENT_REPOSITORY_MAP.remove(id) != null;
   }
}
